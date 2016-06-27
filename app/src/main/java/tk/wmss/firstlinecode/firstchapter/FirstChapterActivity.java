package tk.wmss.firstlinecode.firstchapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import tk.wmss.firstlinecode.R;

/**
 * Created by wmss on 2016/6/23.
 */
public class FirstChapterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_chapter);
        setTitle("第一章");
    }

    public void goToHelloWorld(View view) {
        Intent intent = new Intent(this, HelloWorldActivity.class);
        startActivity(intent);
    }

    public void goToLogCat(View view) {
        Intent intent = new Intent(this, LogCatActivity.class);
        startActivity(intent);
    }
}
