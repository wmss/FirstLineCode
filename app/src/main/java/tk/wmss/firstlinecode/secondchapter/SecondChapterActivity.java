package tk.wmss.firstlinecode.secondchapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

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
}
