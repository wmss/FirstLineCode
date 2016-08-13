package tk.wmss.firstlinecode.firstchapter;

import android.os.Bundle;
import android.util.Log;

import tk.wmss.firstlinecode.R;
import tk.wmss.firstlinecode.successors.LogcatClassNameActivity;

/**
 * Created by wmss on 2016/6/23.
 */
public class LogCatActivity extends LogcatClassNameActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logcat);
        setTitle("第一章→日志工具LogCat");
        Log.v("tag", "Log.v()");
        Log.d("tag", "Log.d()");
        Log.i("tag", "Log.i()");
        Log.w("tag", "Log.w()");
        Log.e("tag", "Log.e()");
    }
}
