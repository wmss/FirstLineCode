package tk.wmss.firstlinecode.secondchapter;

import android.os.Bundle;
import android.support.annotation.Nullable;

import tk.wmss.firstlinecode.R;
import tk.wmss.firstlinecode.successors.LogcatClassNameActivity;

/**
 * Created by wmss on 2016/6/25.
 */
public class TestGoToActivity extends LogcatClassNameActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_go_to);
        setTitle("TestGoToActivity");
    }
}
