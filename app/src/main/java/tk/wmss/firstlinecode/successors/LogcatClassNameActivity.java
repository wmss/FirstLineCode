package tk.wmss.firstlinecode.successors;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by wmss on 2016/8/13.
 */
public class LogcatClassNameActivity extends AppCompatActivity {
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i("当前激活的类是", "" + getClass().getSimpleName());
	}
}