package tk.wmss.firstlinecode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import tk.wmss.firstlinecode.firstchapter.FirstChapterActivity;
import tk.wmss.firstlinecode.secondchapter.SecondChapterActivity;
import tk.wmss.firstlinecode.successors.LogcatClassNameActivity;
import tk.wmss.firstlinecode.thirdchapter.UIWidget;

/**
 * Created by wmss on 2016/6/23.
 */
public class DirectoryActivity extends LogcatClassNameActivity implements AdapterView.OnItemClickListener {

	String[] data = {"第1章 开始启程，你的第一行Android代码", "第2章 先从看到的入手，探究活动", "第3章 软件也要拼脸蛋，UI开发的点点滴滴"};

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
			case 2:
				Intent intent2 = new Intent(this, UIWidget.class);
				startActivity(intent2);
				break;
			default:
				Toast.makeText(DirectoryActivity.this, "暂无操作", Toast.LENGTH_SHORT).show();
				break;
		}
	}
}
