package tk.wmss.firstlinecode.secondchapter;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import tk.wmss.firstlinecode.R;
import tk.wmss.firstlinecode.TestGoToActivity;

/**
 * Created by wmss on 2016/6/28.
 */
public class ActivityLifecycle extends AppCompatActivity {
	private static final String TAG = "在ActivityLifecycle下调用了";

	@SuppressWarnings("ConstantConditions")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i(TAG, "onCreate");
		setContentView(R.layout.activity_lifecycle);
//		getSupportActionBar().hide();
	}

	@Override
	public void onContentChanged() {
		super.onContentChanged();
		Log.i(TAG, "onContentChanged");
	}

	public void onStart() {
		super.onStart();
		Log.i(TAG, "onStart");
	}

	public void onRestart() {
		super.onRestart();
		Log.i(TAG, "onRestart");
	}

	public void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		Log.i(TAG, "onPostCreate");
	}

	@Override
	public void onResume() {
		super.onResume();
		Log.i(TAG, "onResume");
	}

	public void onPostResume() {
		super.onPostResume();
		Log.i(TAG, "onPostResume");
	}

	public void onPause() {
		super.onPause();
		Log.i(TAG, "onPause");
	}

	public void onStop() {
		super.onStop();
		Log.i(TAG, "onStop");
	}

	public void onDestroy() {
		super.onDestroy();
		Log.i(TAG, "onDestroy");
	}

	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		Log.i(TAG, "onConfigurationChanged");
	}

	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.i(TAG, "onSaveInstanceState");
	}

	public void onRestoreInstanceState(Bundle outState) {
		super.onRestoreInstanceState(outState);
		Log.i(TAG, "onRestoreInstanceState");
	}

	public void goToTest(View view) {
		Intent intent = new Intent(this, TestGoToActivity.class);
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_lifecycle_menu, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.activity_lifecycle_menu_item1:
				AlertDialog.Builder builder = new AlertDialog.Builder(ActivityLifecycle.this);
				builder.setTitle("警告");
				builder.setMessage("这是个警告确认框");
				builder.setCancelable(false);
				builder.setPositiveButton("确认", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialogInterface, int i) {
						Toast.makeText(ActivityLifecycle.this, "确认", Toast.LENGTH_SHORT).show();
					}
				});
				builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialogInterface, int i) {

					}
				});
				builder.show();
				break;

			case R.id.activity_lifecycle_menu_item2:
				Intent intent = new Intent(this, TestActivityLifecycle.class);
				startActivity(intent);
				break;

			default:
		}
		return true;
	}

}
