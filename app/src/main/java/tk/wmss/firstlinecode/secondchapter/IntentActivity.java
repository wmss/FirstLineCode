package tk.wmss.firstlinecode.secondchapter;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import tk.wmss.firstlinecode.R;
import tk.wmss.firstlinecode.successors.LogcatClassNameActivity;

/**
 * Created by wmss on 2016/6/25.
 * 严重声明自己！
 * 要长记性，代码要自己审核一遍，
 */
public class IntentActivity extends LogcatClassNameActivity {
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        setTitle("第二章→Intent");

        editText = (EditText) findViewById(R.id.IntentEditText1);
        textView = (TextView) findViewById(R.id.IntentTextView1);
    }

    public void goToTest(View view) {
        //使用隐式Intent来启动
        Intent intent = new Intent(/*"android.intent.action.VIEW"*/
                "tk.wmss.firstlinecode.ACTION_START");
        /*"tk.wmss.firstlinecode.ACTION_START"*/
        intent.addCategory("tk.wmss.firstlinecode.MY_CATEGORY");
        startActivity(intent);
    }

    public void goToBaiDu(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.baidu.com"));
        startActivity(intent);
    }

    public void goToTel10086(View view) {
        Intent intent = new Intent(Intent./*ACTION_DIAL*/ACTION_VIEW);
        /**
         * ACTION_DIAL 和 ACTION_VIEW 是Android系统的内置动作
         * ACTION_DIAL 与 ACTION_VIEW 的区别
         * ACTION_VIEW：会在TEL界面显示10086
         * ACTION_DIAL: 会在TEL界面显示1008-6（电话号码会以一定的格式分隔）
         */
        intent.setData(Uri.parse("tel:10086"));
        startActivity(intent);
    }

    public void PassDataDown(View view) {
        String data = editText.getText().toString();
        Toast.makeText(IntentActivity.this, data, Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, IntentPassData.class);
        intent.putExtra("extra_data", data);
        startActivityForResult(intent, 1);
        //startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    String s = data.getStringExtra("data_return");
                    String s2 = textView.getText().toString();
                    textView.setText(s2 + ":" + s);
                    Log.i("数据", s);
                }
                break;
            default:
        }
    }
}
