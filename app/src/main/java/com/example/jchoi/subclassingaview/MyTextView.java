package com.example.jchoi.subclassingaview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

import com.example.jchoi.subclassingaview.R;

/**
 * Created by 2016jchoi on 9/21/2015.
 */
public class MyTextView extends TextView {

    public MyTextView(Context context, AttributeSet attrs){
        super(context, attrs);
        setUpAttributes(attrs);

        setText(mValue+"");
    }
    private int mValue;
    private void setUpAttributes(AttributeSet attrs){
        TypedArray a = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.MyTextView, 0, 0);
        try {
            mValue = a.getInt(R.styleable.MyTextView_initialValue, 0);
        }
        finally {
            a.recycle();
        }
    }
    public void incrementAndUpdate() {
        mValue++;
        setText(mValue + "");

    }

    public int getmValue(){
        return mValue;
    }

}
