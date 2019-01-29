package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    Paint paint = new Paint();
    Path path = new Path(); // 初始化 Path 对象
    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        //1设置背景颜色
        canvas.drawColor(Color.GRAY);
        //2画坐标轴
        paint.setColor(Color.WHITE);
        float[] lines = {100,100,100,600,100,600,900,600};
        canvas.drawLines(lines,paint);
        //3 画直方
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);
        path.moveTo(110,600);

        path.rLineTo(80,0);

        path.rMoveTo(10,0);
        path.rLineTo(0,-50);
        path.rLineTo(80,0);
        path.rLineTo(0,50);

        path.rMoveTo(10,0);
        path.rLineTo(0,-50);
        path.rLineTo(80,0);
        path.rLineTo(0,50);

        path.rMoveTo(10,0);
        path.rLineTo(0,-200);
        path.rLineTo(80,0);
        path.rLineTo(0,200);

        path.rMoveTo(10,0);
        path.rLineTo(0,-350);
        path.rLineTo(80,0);
        path.rLineTo(0,350);

        path.rMoveTo(10,0);
        path.rLineTo(0,-400);
        path.rLineTo(80,0);
        path.rLineTo(0,400);

        path.rMoveTo(10,0);
        path.rLineTo(0,-150);
        path.rLineTo(80,0);
        path.rLineTo(0,150);
        canvas.drawPath(path,paint);
        //4画文字
        paint.setTextSize(20);
        paint.setColor(Color.WHITE);
        String[] bottonTexts = {"froyo","GB","ics","JB","kitkat","L","M"};
        int x = 50;
        int y = 650;
        for (int i = 0; i < 7; i++) {
            x+= 90;
            canvas.drawText(bottonTexts[i],x, y, paint);
        }
        paint.setTextSize(50);
        canvas.drawText("直方图",400, 800, paint);
    }
}
