package tk.wmss.firstlinecode.secondchapter.StartupMode;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import tk.wmss.firstlinecode.R;
import tk.wmss.firstlinecode.successors.LogcatClassNameActivity;

/**
 * Created by wmss on 2016/8/15.
 */
public class SingleInstanceModeActivity extends LogcatClassNameActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i("LogCat标识", "SingleInstance");
		Log.i("LogCat标识", "SingleInstance的Task ID是：" + getTaskId());
		setContentView(R.layout.activity_single_instance);
		setTitle("第二章→启动模式→SingleInstance");
	}

	public void goToSingInstanceTest(View view) {
		Intent intent = new Intent(this, SingleInstanceModeTestActivity.class);
		startActivity(intent);
	}

	public void goToSingInstance(View view) {
		Toast.makeText(SingleInstanceModeActivity.this, "Test", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(this, SingleInstanceModeActivity.class);
		startActivity(intent);
		Toast.makeText(SingleInstanceModeActivity.this, "点击了", Toast.LENGTH_SHORT).show();
	}
}
