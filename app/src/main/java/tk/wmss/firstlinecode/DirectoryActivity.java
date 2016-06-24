package tk.wmss.firstlinecode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import tk.wmss.firstlinecode.firstchapter.FirstChapterActivity;
import tk.wmss.firstlinecode.secondchapter.SecondChapterActivity;

/**
 * Created by wmss on 2016/6/23.
 */
public class DirectoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory);
        setTitle("目录");
    }

    public void goToFirsChapter(View view) {
        Intent intent = new Intent(this, FirstChapterActivity.class);
        startActivity(intent);
    }

    public void goToSecondChapter(View view) {
        Intent intent = new Intent(this, SecondChapterActivity.class);
        startActivity(intent);
    }

    public void goTOThirdChapter(View view) {

    }
}
