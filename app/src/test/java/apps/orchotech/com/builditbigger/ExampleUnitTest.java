package apps.orchotech.com.builditbigger;

import android.content.Context;
import android.support.v4.util.Pair;
import android.test.AndroidTestCase;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import apps.orchotech.com.builditbigger.gce.EndpointsAsyncTask;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest extends AndroidTestCase {
    private EndpointsAsyncTask mTask;

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
}