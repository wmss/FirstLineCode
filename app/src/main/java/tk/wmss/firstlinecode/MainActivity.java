package tk.wmss.firstlinecode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void goToDirectory(View view) {
        Intent intent = new Intent(this, DirectoryActivity.class);
        startActivity(intent);
        finish();
    }

}
