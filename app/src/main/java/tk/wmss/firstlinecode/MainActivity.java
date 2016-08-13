package tk.wmss.firstlinecode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

import tk.wmss.firstlinecode.successors.LogcatClassNameActivity;

public class MainActivity extends LogcatClassNameActivity {

	Timer timer = new Timer();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (getSupportActionBar() != null)
			getSupportActionBar().hide();

		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				goToDirectory();
			}
		};
		timer.schedule(task, 1000 * 4);

	}

	public void goToDirectory(View view) {
		timer.cancel();
		goToDirectory();

	}

	private void goToDirectory() {
		Intent intent = new Intent(this, DirectoryActivity.class);
		startActivity(intent);
		finish();
	}

}
