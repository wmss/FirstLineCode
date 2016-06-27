package tk.wmss.firstlinecode.secondchapter;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import tk.wmss.firstlinecode.R;

/**
 * Created by wmss on 2016/6/26.
 */
public class IntentPassData extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_pass_data);
        setTitle("第二章→Intent→IntentPassData");

        TextView textView = (TextView) findViewById(R.id.IntentPassDataTextView1);
        editText = (EditText) findViewById(R.id.IntentPassDataEditText1);

        Intent intent = getIntent();
        String text = intent.getStringExtra("extra_data");
        String s = textView.getText().toString() + "：" + text;

        textView.setText(s);
        textView.setTextColor(Color.BLACK);

    }

    public void PassDataUp(View view) {
        PassDataCode();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        PassDataCode();
    }

    private void PassDataCode() {
        String data = editText.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("data_return", data);
        setResult(RESULT_OK, intent);
        finish();
    }
}