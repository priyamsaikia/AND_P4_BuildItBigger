package apps.orchotech.com.builditbigger.network;

/**
 * Created by PriyamSaikia on 3/27/2016.
 */
public class MyConnection {
    public interface IMyConnection {
        void onSuccess(String response, int requestId);

        void onFailure(String error, int requestId);
    }
}
