package tk.wmss.firstlinecode.thirdchapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

import tk.wmss.firstlinecode.R;
import tk.wmss.firstlinecode.successors.LogcatClassNameActivity;

/**
 * Created by wmss on 2016/8/16.
 */
public class UIWidget extends LogcatClassNameActivity implements View.OnClickListener {
	private static final String TAG = "Run i ";
	private boolean textViewB = true;
	private boolean buttonB = true;
	private TextView textView = null;
	private Timer timer = new Timer();
	private int i = 0;
	private int[] colorArgs = {0xFFEBC13D, 0xFFF55324, 0xFFB400DE, 0xFF175FF5, 0xFF00CE6D};

	@Override

	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ui);
		textView = (TextView) findViewById(R.id.ui_text_view_1);
		Button button = (Button) findViewById(R.id.ui_button_1);

		button.setOnClickListener(this);
		textView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				if (textViewB) {
					Toast.makeText(UIWidget.this, "" + textView.getText().toString(), Toast.LENGTH_SHORT).show();
					textViewB = false;
				}
//				textView.setTextColor(0xFFEBC13D);

				timer.schedule(new TimerTask() {
					@Override
					public void run() {
						UIWidget.this.runOnUiThread(new Runnable() {
							@Override
							public void run() {
								Log.i(TAG, "" + i);
								if (i < colorArgs.length) {
									textView.setTextColor(colorArgs[i]);
									i++;
									Log.i(TAG, "i++后 i=" + i);
								} else {
									i = 0;
									Log.i(TAG, "查看i是否归零 i=" + i);
//									timer.cancel();
								}

							}
						});
					}
				}, 0, 500);
			}
		});
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		timer.cancel();
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
			case R.id.ui_button_1:

				if (buttonB) {
					textView.setText("UI");
					buttonB = false;
				} else {
					textView.setText("UIWidget");
					buttonB = true;
				}
				break;

		}
	}
}
