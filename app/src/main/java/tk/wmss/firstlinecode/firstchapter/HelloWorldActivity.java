package tk.wmss.firstlinecode.firstchapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import tk.wmss.firstlinecode.R;

/**
 * Created by wmss on 2016/6/23.
 */
public class HelloWorldActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        setTitle("第一章→HollerWorld");
    }
}
