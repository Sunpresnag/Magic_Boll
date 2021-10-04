package com.example.magicboll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class MyDraw extends View {
    public MyDraw(Context context) {
        super(context);
    }
    Paint p = new Paint();
    protected  void onDrow(Canvas canvas){
        canvas.drawCircle(100,200,50, p);
    }
}
