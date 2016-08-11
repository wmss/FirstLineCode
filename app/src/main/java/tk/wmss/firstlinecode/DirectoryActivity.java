package tk.wmss.firstlinecode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import tk.wmss.firstlinecode.firstchapter.FirstChapterActivity;
import tk.wmss.firstlinecode.secondchapter.SecondChapterActivity;

/**
 * Created by wmss on 2016/6/23.
 */
public class DirectoryActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

	String[] data = {"第1章 开始启程，你的第一行Android代码", "第2章 先从看到的入手，探究活动"};

	@Override

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_directory);
		setTitle("目录");
		ArrayAdapter<String> adapter = new ArrayAdapter<>(
				this, R.layout.support_simple_spinner_dropdown_item, data);
		ListView listView = (ListView) findViewById(R.id.directory_list_view);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(this);
//		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//			@Override
//			public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//				switch (i) {
//					case 0:
//						Intent intent = new Intent(DirectoryActivity.this, FirstChapterActivity.class);
//						startActivity(intent);
//						break;
//					case 1:
//						Intent intent1 = new Intent(DirectoryActivity.this, SecondChapterActivity.class);
//						startActivity(intent1);
//						break;
//					default:
//						Toast.makeText(DirectoryActivity.this, "暂无操作", Toast.LENGTH_SHORT).show();
//						break;
//				}
//			}
//		});

	}


	@Override
	public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
		switch (i) {
			case 0:
				Intent intent = new Intent(this, FirstChapterActivity.class);
				startActivity(intent);
				break;
			case 1:
				Intent intent1 = new Intent(this, SecondChapterActivity.class);
				startActivity(intent1);
				break;
			default:
				Toast.makeText(DirectoryActivity.this, "暂无操作", Toast.LENGTH_SHORT).show();
				break;
		}
	}
}
