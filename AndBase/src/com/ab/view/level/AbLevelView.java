/*
 * Copyright (C) 2013 www.418log.org
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ab.view.level;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

// TODO: Auto-generated Javadoc
/**
 * �������ȼ���View.
 * @author zhaoqp
 * @date 2011-11-28
 * @version
 */

public class AbLevelView extends View {
	
	/** The m context. */
	private Context mContext;
	
	/** The m ab level chart. */
	private AbLevelChart mAbLevelChart;
	
	/** The m paint. */
	private Paint mPaint ;
	
	/** The width. */
	private int width;
	
	/** The height. */
	private int height; 
	
	/** ��Ļ����. */
	private int screenWidth = 0;
	
	/** ��Ļ�߶�. */
	private int screenHeight = 0;


	/**
	 * Instantiates a new ab level view.
	 *
	 * @param context the context
	 * @param abstractChart the abstract chart
	 */
	public AbLevelView(Context context,AbLevelAbstractChart abstractChart) {
		super(context);
		this.mContext = context;
		this.mAbLevelChart = (AbLevelChart)abstractChart;
		mPaint = new Paint();
		DisplayMetrics displayMetrics = new DisplayMetrics(); 
		((Activity)context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
		screenWidth = displayMetrics.widthPixels; 
		screenHeight = displayMetrics.heightPixels; 
	}
	

	/**
	 * Instantiates a new ab level view.
	 *
	 * @param context the context
	 * @param attrs the attrs
	 * @param defStyle the def style
	 */
	public AbLevelView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	/**
	 * Instantiates a new ab level view.
	 *
	 * @param context the context
	 * @param attrs the attrs
	 */
	public AbLevelView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	/**
	 * Instantiates a new ab level view.
	 *
	 * @param context the context
	 */
	public AbLevelView(Context context) {
		super(context);
	}



	/**
	 * ����������.
	 *
	 * @param canvas the canvas
	 * @see android.view.View#onDraw(android.graphics.Canvas)
	 */
	@Override
	public void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		this.width = getMeasuredWidth();
		this.height = getMeasuredHeight();
		mAbLevelChart.draw(canvas, 0, 0, width,height,screenWidth,screenHeight, mPaint);
		
	}
	
}