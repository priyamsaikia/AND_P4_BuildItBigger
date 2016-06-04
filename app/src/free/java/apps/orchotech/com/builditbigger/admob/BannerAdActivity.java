package apps.orchotech.com.builditbigger.admob;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import apps.orchotech.com.builditbigger.R;

/**
 * Created by PriyamSaikia on 03-06-2016.
 */
public class BannerAdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad);
        startActivity(new Intent(this,InterstitialAdActivity.class));
        AdView adView = (AdView) findViewById(R.id.ad_banner);

        adView.loadAd(new AdRequest.Builder().build());

       // adView.setAdListener(new AppAdListener(this));
    }
}
