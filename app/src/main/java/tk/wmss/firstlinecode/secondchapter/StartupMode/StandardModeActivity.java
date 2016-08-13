package tk.wmss.firstlinecode.secondchapter.StartupMode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import tk.wmss.firstlinecode.R;
import tk.wmss.firstlinecode.successors.LogcatClassNameActivity;

/**
 * Created by wmss on 2016/7/3.
 */
public class StandardModeActivity extends LogcatClassNameActivity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_standard_mode);
		Button button = (Button) findViewById(R.id.startup_mode_button);
		button.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
			case R.id.startup_mode_button:
				Intent intent = new Intent(this, StandardModeActivity.class);
				startActivity(intent);
				break;

			default:
				break;
		}
	}
}
