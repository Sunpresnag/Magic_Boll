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

    protected  void onDraw(Canvas canvas){
        canvas.drawCircle(100,200,50, p);
        canvas.drawLine(0,0,300,500, p);
        canvas.drawRect(30,30,150,100, p);
    }
}
