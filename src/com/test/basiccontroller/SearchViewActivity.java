package com.test.basiccontroller;

import com.example.androidbasicknowledge.R;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;

public class SearchViewActivity extends Activity {
	private ListView mListView ;
	private SearchView mSearchView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
		setTheme(R.style.AppBaseTheme);
		setContentView(R.layout.searchview);
		init();
	}
	/**
	 * 
	 */
	private void init(){
		mListView = (ListView)findViewById(R.id.searchview_listview);
		mSearchView = (SearchView)findViewById(R.id.searchview_searcheview);
		mListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,initAdapter()));
		mListView.setTextFilterEnabled(true);
		mSearchView.setIconifiedByDefault(false);
		mSearchView.setQueryHint("ËÑË÷");
		mSearchView.setSubmitButtonEnabled(true);
		mSearchView.setOnQueryTextListener(new OnQueryTextListener() {
			
			@Override
			public boolean onQueryTextSubmit(String arg0) {
				return false;
			}
			
			@Override
			public boolean onQueryTextChange(String arg0) {
				if(TextUtils.isEmpty(arg0)){
					mListView.clearTextFilter();
				}else{
					mListView.setFilterText(arg0);
				}
				return true;
			}
		});
		initAdapter();
	}
	
	private String[] initAdapter(){
		return getResources().getStringArray(R.array.booklist);
	}
}
