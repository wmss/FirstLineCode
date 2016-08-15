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
public class SingleTaskModeActivity extends LogcatClassNameActivity {
	private static final String TAG = "LogCat标识";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i(TAG, "SingleTask");
		setContentView(R.layout.activity_single_task);
		setTitle("第二章→启动模式→SingleTask");
	}

	public void goToSingTaskTest(View view) {
		Intent intent = new Intent(this, SingleTaskModeTestActivity.class);
		startActivity(intent);
	}

	public void StartOneselfIn(View view) {
		Intent intent = new Intent(this, SingleTaskModeActivity.class);
		startActivity(intent);
		Toast.makeText(SingleTaskModeActivity.this, "点击了", Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.i(TAG, "onRestart");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.i(TAG, "onDestroy");
	}
}
