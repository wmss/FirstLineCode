package tk.wmss.firstlinecode;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by wmss on 2016/6/25.
 */
public class TestGoToActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_go_to);
        setTitle("TestGoToActivity");
    }
}
