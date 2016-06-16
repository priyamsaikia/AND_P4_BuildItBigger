package apps.orchotech.com.builditbigger;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.orchotech.java.library.Comedian;

import apps.orchotech.com.androidlibrary.LibActivity;
import apps.orchotech.com.builditbigger.gce.EndpointsAsyncTask;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements EndpointsAsyncTask.AsyncCallBack {

    private static final String TAG = MainActivity.class.getSimpleName();
    @Bind(R.id.btn_tell_me_a_joke)
    Button btn;
    @Bind(R.id.ad_banner)
    AdView adView;
    private InterstitialAd mInterstitialAd;
    private ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(String.valueOf(getText(R.string.test_inter_ad_unit_id)));
        final AdRequest adRequest = new AdRequest.Builder().build();
        mInterstitialAd.loadAd(adRequest);
    }

    @OnClick(R.id.btn_tell_me_a_joke)
    public void onButtonClick(View v) {

        mProgressDialog = new ProgressDialog(MainActivity.this);
        mProgressDialog.setMessage("Retrieving Jokes...");
        mProgressDialog.show();
        new EndpointsAsyncTask().execute(new Pair<Context, String>(this, "priyam"));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onPostExecute(String joke) {
        mProgressDialog.hide();
        Intent intent = new Intent(this, LibActivity.class);
        intent.putExtra("joke", joke);
        if (mInterstitialAd.isLoaded())
            mInterstitialAd.show();
        startActivity(intent);

    }

    @Override
    protected void onStart() {
        super.onStart();
        adView.loadAd(new AdRequest.Builder().build());
    }
}
