package tk.wmss.firstlinecode.secondchapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import tk.wmss.firstlinecode.R;

/**
 * Created by wmss on 2016/6/28.
 */
public class TestActivityLifecycle extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity_lifecycle);
    }
}