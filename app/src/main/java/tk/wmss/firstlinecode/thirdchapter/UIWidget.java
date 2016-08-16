package tk.wmss.firstlinecode.thirdchapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

import tk.wmss.firstlinecode.R;
import tk.wmss.firstlinecode.successors.LogcatClassNameActivity;

/**
 * Created by wmss on 2016/8/16.
 */
public class UIWidget extends LogcatClassNameActivity {
	boolean textViewB = true;
	private TextView textView = null;
	private Timer timer = new Timer();

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ui);
		textView = (TextView) findViewById(R.id.ui_text_view_1);
		textView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				if (textViewB) {
					Toast.makeText(UIWidget.this, "" + textView.getText().toString(), Toast.LENGTH_SHORT).show();
					textViewB = false;
				}
				textView.setTextColor(0xff3eb55d);
				TimerTask task = new TimerTask() {
					@Override
					public void run() {

					}
				};
				timer.schedule(task, 1000 * 4);
			}
		});
	}
}
