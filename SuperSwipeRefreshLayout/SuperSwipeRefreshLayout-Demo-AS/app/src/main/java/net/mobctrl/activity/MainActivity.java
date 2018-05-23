package net.mobctrl.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import net.mobctrl.treerecyclerview.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {
	@BindView(R.id.recyclerview_tv)
	TextView recyclerview_tv;
	@BindView(R.id.listview_tv)
	TextView listview_tv;
	@BindView(R.id.scrollview_tv)
	TextView scrollview_tv;
	@BindView(R.id.nested_scrollview_tv)
	TextView nested_scrollview_tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButterKnife.bind(this);
	}

	@OnClick({R.id.recyclerview_tv,R.id.listview_tv,R.id.scrollview_tv,R.id.nested_scrollview_tv})
	public void onClick(View v) {
		Intent intent;
		switch (v.getId()) {
			case R.id.recyclerview_tv:
				intent = new Intent(MainActivity.this,
						RecyclerViewActivity.class);
				startActivity(intent);
				break;
			case R.id.listview_tv:
				intent = new Intent(MainActivity.this,
						ListViewActivity.class);
				startActivity(intent);
				break;
			case R.id.scrollview_tv:
				intent = new Intent(MainActivity.this,
						ScrollViewActivity.class);
				startActivity(intent);
				break;
			case R.id.nested_scrollview_tv:
				intent  = new Intent(MainActivity.this,NestedScrollViewActivity.class);
				startActivity(intent);
				break;
			default:
				break;
		}
	}

}
