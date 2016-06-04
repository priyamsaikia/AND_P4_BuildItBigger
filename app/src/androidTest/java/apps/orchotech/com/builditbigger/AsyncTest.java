package apps.orchotech.com.builditbigger;

import android.content.Context;
import android.support.v4.util.Pair;
import android.test.AndroidTestCase;

import java.util.concurrent.TimeUnit;

import apps.orchotech.com.builditbigger.gce.EndpointsAsyncTask;

/**
 * Created by PriyamSaikia on 04-06-2016.
 */
public class AsyncTest extends AndroidTestCase {
    private EndpointsAsyncTask mTask;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mTask = new EndpointsAsyncTask() {
            @Override
            protected void onPostExecute(String result) {
                super.onPostExecute(result);
            }
        };
    }

    public void testAsyncTask() {
        try {
            mTask.execute(new Pair<Context, String>(getContext(), "TestCase"));
            String result = mTask.get(20, TimeUnit.SECONDS);
            assertNotNull(result);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Time out!");
        }
    }
}
