package apps.orchotech.com.builditbigger.admob;

import android.content.Context;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;

/**
 * Created by PriyamSaikia on 04-06-2016.
 */
public class AppAdListener extends AdListener {
    Context mContext;

    public AppAdListener(Context context) {
        mContext = context;
    }

    @Override
    public void onAdClosed() {
        super.onAdClosed();
        showToast("Add has been closed");
    }

    @Override
    public void onAdFailedToLoad(int i) {
        super.onAdFailedToLoad(i);
        getErrorReason(i);
    }

    private void getErrorReason(int i) {
        switch (i) {
            case AdRequest.ERROR_CODE_INTERNAL_ERROR:
                showToast("Internal Error");
                break;
            case AdRequest.ERROR_CODE_INVALID_REQUEST:
                showToast("Invalid Request");
                break;
            case AdRequest.ERROR_CODE_NETWORK_ERROR:
                showToast("Network Error");
                break;
            case AdRequest.ERROR_CODE_NO_FILL:
                showToast("No Fill Error");
                break;
            default:
                showToast("idk dude! you messed up!");
        }
    }

    @Override
    public void onAdLoaded() {
        super.onAdLoaded();
        showToast("Ad has been loaded");
    }

    @Override
    public void onAdOpened() {
        super.onAdOpened();
        showToast("Ad has been opened");
    }

    @Override
    public void onAdLeftApplication() {
        super.onAdLeftApplication();
        showToast("Ad has left the application");
    }

    private void showToast(String msg) {
        Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
    }
}
