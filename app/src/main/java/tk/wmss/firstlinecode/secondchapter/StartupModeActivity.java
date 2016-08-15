package tk.wmss.firstlinecode.secondchapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import tk.wmss.firstlinecode.R;
import tk.wmss.firstlinecode.secondchapter.StartupMode.SingleInstanceModeActivity;
import tk.wmss.firstlinecode.secondchapter.StartupMode.SingleTaskModeActivity;
import tk.wmss.firstlinecode.secondchapter.StartupMode.SingleTopModeActivity;
import tk.wmss.firstlinecode.secondchapter.StartupMode.StandardModeActivity;
import tk.wmss.firstlinecode.successors.LogcatClassNameActivity;

/**
 * Created by wmss on 2016/6/29.
 */
public class StartupModeActivity extends LogcatClassNameActivity implements View.OnClickListener {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("第二章→Activity的启动模式");
		setContentView(R.layout.activity_startup_mode);

		Button button = (Button) findViewById(R.id.goToStandardMode);
		Button button1 = (Button) findViewById(R.id.goToSingleTopMode);
		Button button2 = (Button) findViewById(R.id.goToSingleTaskMode);
		Button button3 = (Button) findViewById(R.id.goToSingleInstanceMode);

		button.setOnClickListener(this);
		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);

	}


	@Override
	public void onClick(View view) {
		switch (view.getId()) {
			case R.id.goToStandardMode:
				Intent intent = new Intent(this, StandardModeActivity.class);
				startActivity(intent);
				break;

			case R.id.goToSingleTopMode:
				Intent intent1 = new Intent(this, SingleTopModeActivity.class);
				startActivity(intent1);
				break;

			case R.id.goToSingleTaskMode:
				Intent intent2 = new Intent(this, SingleTaskModeActivity.class);
				startActivity(intent2);
				break;

			case R.id.goToSingleInstanceMode:
				Intent intent3 = new Intent(this, SingleInstanceModeActivity.class);
				startActivity(intent3);
				break;

			default:
				break;
		}
	}
}
