package com.test.basiccontroller;

import com.example.androidbasicknowledge.R;
import android.app.Activity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;

public class PopupMenuActivity extends Activity {

	public static final String TAG = "PopupMenuActivity";

	private Button mBtnSelected;

	private ImageView popmenuImage;

	protected void onCreate(android.os.Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.popmenu);
		init();
	};

	private void init(){
		mBtnSelected = (Button)findViewById(R.id.popmenu_button);
		popmenuImage = (ImageView)findViewById(R.id.popmenu_imageview);
		mBtnSelected.setOnClickListener(onClickListener);
	}

	private OnClickListener onClickListener = new OnClickListener(){
		@Override
		public void onClick(View arg0) {
			PopupMenu popupmenu = new PopupMenu(PopupMenuActivity.this,mBtnSelected);
			popupmenu.getMenuInflater().inflate(R.menu.popmenu_item, popupmenu.getMenu());
			popupmenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

				@Override
				public boolean onMenuItemClick(MenuItem item) {
					ImageView view = (ImageView)findViewById(R.id.popmenu_imageview);
					switch(item.getItemId()){
					case R.id.sun :
						view.setImageResource(R.drawable.ic_launcher);
						Log.d(TAG,"sun is clicked");
						break;
					case R.id.wind:
						view.setImageResource(R.drawable.ic_launcher);
						Log.d(TAG,"wind is clicked");
						break;
					case R.id.cload:
						view.setImageResource(R.drawable.ic_launcher);
						Log.d(TAG,"cload is clicked");
						break;
					case R.id.rain:
						view.setImageResource(R.drawable.ic_launcher);
						Log.d(TAG,"rain is clicked");
						break;
					case R.id.snow:
						view.setImageResource(R.drawable.ic_launcher);
						Log.d(TAG,"snow is clicked");
						break;
					}
					return true;
				}
			});
		}
	};
}
