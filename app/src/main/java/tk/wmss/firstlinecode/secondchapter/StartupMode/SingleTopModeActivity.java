package tk.wmss.firstlinecode.secondchapter.StartupMode;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import tk.wmss.firstlinecode.R;
import tk.wmss.firstlinecode.successors.LogcatClassNameActivity;

/**
 * Created by wmss on 2016/8/13.
 */
public class SingleTopModeActivity extends LogcatClassNameActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i("LogCat标识", "SingleTop");
		setContentView(R.layout.activity_single_top);
		setTitle("第二章→启动模式→SingleTop");
	}

	public void StartOneselfIn(View view) {
		Intent intent = new Intent(this, SingleTopModeActivity.class);
		startActivity(intent);
		Toast.makeText(SingleTopModeActivity.this, "你点击了", Toast.LENGTH_SHORT).show();
	}

	public void goToSingTopTest(View view) {
		Intent intent = new Intent(this, SingleTopModeTestActivity.class);
		startActivity(intent);
	}
}
