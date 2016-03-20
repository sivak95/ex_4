package com.example.sivaprakasam.ex4;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    ImageView iv;
    Bitmap bitmap;
    Canvas canvas;
    Paint paint;
    Path path;

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=(ImageView)findViewById(R.id.iv);
        bitmap=Bitmap.createBitmap(500,500, Bitmap.Config.ARGB_8888);
        path=new Path();
        canvas=new Canvas(bitmap);
        paint=new Paint();
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        path.lineTo(0,100);
        path.lineTo(100,100);
        path.lineTo(250,50);
        path.lineTo(50,25);
        path.lineTo(0,100);
        path.lineTo(200,0);

        canvas.drawPath(path,paint);
        paint.setColor(Color.RED);
        canvas.drawCircle(bitmap.getWidth()/2,bitmap.getHeight()/2,10,paint);
        paint.setColor(Color.BLACK);

        canvas.drawRect(550, 50, 400, 250, paint);
        paint.setColor(Color.YELLOW);
        canvas.drawArc(10,10,10,10,45,90,true,paint);
        paint.setColor(Color.CYAN);
        canvas.drawLine(1000, 500, 350, 500, paint);
        paint.setColor(Color.BLUE);
        canvas.drawOval(new RectF(bitmap.getWidth()/4, bitmap.getHeight()/4, 200 , 300), paint);
        iv.setImageBitmap(bitmap);
    }
}
