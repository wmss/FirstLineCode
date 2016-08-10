package tk.wmss.firstlinecode.secondchapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import tk.wmss.firstlinecode.R;
import tk.wmss.firstlinecode.secondchapter.StartupMode.StandardModeActivity;

/**
 * Created by wmss on 2016/6/29.
 */
public class StartupModeActivity extends AppCompatActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("Activity的启动模式");
		setContentView(R.layout.activity_startup_mode);
	}

	public void goToStandardMode(View view) {
		Intent intent = new Intent(this, StandardModeActivity.class);
		startActivity(intent);
	}
}