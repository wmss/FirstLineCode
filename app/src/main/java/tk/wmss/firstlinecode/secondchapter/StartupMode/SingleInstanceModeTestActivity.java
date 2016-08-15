package tk.wmss.firstlinecode.secondchapter.StartupMode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import tk.wmss.firstlinecode.R;
import tk.wmss.firstlinecode.successors.LogcatClassNameActivity;

/**
 * Created by wmss on 2016/8/15.
 */
public class SingleInstanceModeTestActivity extends LogcatClassNameActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("SingleInstance Test");
		setContentView(R.layout.activity_sing_instance_test);
	}

	public void goToSingInstance(View view) {
		Intent intent = new Intent(this, SingleInstanceModeActivity.class);
		startActivity(intent);
	}
}