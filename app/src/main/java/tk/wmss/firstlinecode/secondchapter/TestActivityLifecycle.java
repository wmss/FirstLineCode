package tk.wmss.firstlinecode.secondchapter;

import android.os.Bundle;

import tk.wmss.firstlinecode.R;
import tk.wmss.firstlinecode.successors.LogcatClassNameActivity;

/**
 * Created by wmss on 2016/6/28.
 */
public class TestActivityLifecycle extends LogcatClassNameActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity_lifecycle);
    }
}
