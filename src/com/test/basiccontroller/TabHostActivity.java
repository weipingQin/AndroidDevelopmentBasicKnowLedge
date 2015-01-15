package com.test.basiccontroller;

import com.example.androidbasicknowledge.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class TabHostActivity extends Activity {

	private RadioGroup radiogroup;
	private RadioButton radiobutton;
	private int index;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);  
		setContentView(R.layout.viewpager);
		init();
	}

	/**
	 * 初始化页面上的组件
	 * viewPager
	 * radionButton radioGroup
	 */
	private void init(){
		initViewPager();
	}
	
	/**
	 * 初始化ViewPager组件
	 */
	private void initViewPager(){
		//Intent intent = null;
		
	}


}
