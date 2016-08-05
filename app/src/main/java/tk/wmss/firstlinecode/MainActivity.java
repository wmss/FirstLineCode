package tk.wmss.firstlinecode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

	private Intent intent = new Intent(this, DirectoryActivity.class);//你要转向的Activity

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getSupportActionBar().hide();

		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				goToDirectory();
			}
		};
		timer.schedule(task, 1000 * 3);
	}

	public void goToDirectory(View view) {
		goToDirectory();
	}

	private void goToDirectory() {
		startActivity(intent);
		finish();
	}

}
