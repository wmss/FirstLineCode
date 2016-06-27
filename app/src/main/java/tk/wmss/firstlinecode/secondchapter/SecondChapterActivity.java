package tk.wmss.firstlinecode.secondchapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import tk.wmss.firstlinecode.R;

/**
 * Created by wmss on 2016/6/24.
 */
public class SecondChapterActivity extends AppCompatActivity {

    private boolean B = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_chapter);
        setTitle("第二章");
    }

    public void hideTitle(View view) {
        if (B) {
            getSupportActionBar().hide();
            B = false;
        } else {
            getSupportActionBar().show();
            B = true;
        }
    }

    public void showToast(View view) {
        /*
        * Toast.makeText(上下文,显示的字符串,显示的时间).show;
        * */
        Toast.makeText(SecondChapterActivity.this, "我就是那个要显示的Toast", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.second_chapter, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(SecondChapterActivity.this, "you clicked Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(SecondChapterActivity.this, "you clicked Remove", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void finishActivity(View view) {
        finish();
    }

    public void goToIntent(View view) {
        /*
        * Intent intent = new Intent(上下文【context】,要启动的活动);
        * 然后使用startActivity();启动活动。
        * startActivity(intent);
        * */
        Intent intent = new Intent(SecondChapterActivity.this, IntentActivity.class);
        startActivity(intent);
    }
}
