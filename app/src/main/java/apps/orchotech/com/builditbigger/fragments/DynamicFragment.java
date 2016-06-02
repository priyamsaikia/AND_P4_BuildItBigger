package apps.orchotech.com.builditbigger.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.orchotech.java.library.Comedian;

import apps.orchotech.com.androidlibrary.LibActivity;
import apps.orchotech.com.builditbigger.R;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by PriyamSaikia on 01-06-2016.
 */
public class DynamicFragment extends Fragment {
    @Bind(R.id.btn_tell_me_a_joke)
    Button btn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dynamic, null);
        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick(R.id.btn_tell_me_a_joke)
    public void onButtonClick(View v) {
        Comedian comedian = new Comedian();
        String joke = comedian.perform();
        Intent intent=new Intent(getActivity(), LibActivity.class);
        intent.putExtra("joke",joke);
        startActivity(intent);
    }
}
