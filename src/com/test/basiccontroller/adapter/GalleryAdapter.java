package com.test.basiccontroller.adapter;

import java.util.List;

import com.example.androidbasicknowledge.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class GalleryAdapter extends BaseAdapter{
	
	private LayoutInflater inflater;
	private Context mContext;
	private String[] mList;
	
	public GalleryAdapter(Context context,String[] list){
		mContext = context;
		inflater = LayoutInflater.from(context);
		mList = list;
	}

	@Override
	public int getCount() {
		return mList.length;
	}
	
	public void update(String[] list){
		mList = list;
		notifyDataSetChanged();
	}

	@Override
	public Object getItem(int arg0) {
		return mList[arg0];
	}

	@Override
	public long getItemId(int arg0) {
		return arg0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		if(arg1 == null){
			arg1 = inflater.inflate(R.layout.gallery_item, null);
		}
		return arg1;
	}

}
