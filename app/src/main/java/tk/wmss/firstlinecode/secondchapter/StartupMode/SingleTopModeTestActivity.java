package tk.wmss.firstlinecode.secondchapter.StartupMode;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import tk.wmss.firstlinecode.R;
import tk.wmss.firstlinecode.successors.LogcatClassNameActivity;

/**
 * Created by wmss on 2016/8/15.
 */
public class SingleTopModeTestActivity extends LogcatClassNameActivity {
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("SingleTop Test");
		setContentView(R.layout.activity_single_top_test);
	}

	public void goToSingleTop(View view) {
		Intent intent = new Intent(this, SingleTopModeActivity.class);
		startActivity(intent);
	}
}
