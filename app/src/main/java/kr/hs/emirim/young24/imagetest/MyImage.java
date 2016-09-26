package kr.hs.emirim.young24.imagetest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by appcreator05 on 2016. 9. 26..
 */
public class MyImage extends View {
    MyImage(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap picture = BitmapFactory.decodeResource(getResources(), R.drawable.strawberry);
        float cx = getWidth() / 2.0f;
        float cy = getWidth() / 2.0f; //view의 정중앙 좌표

        float x = (getWidth() - picture.getWidth()) / 2.0f;
        float y = (getWidth() - picture.getHeight()) / 2.0f;
        //회전
//            canvas.rotate(45, cx, cy);//회전시키는 것
        //canvas이동, 마치 이미지가 이동하는 것처럼 보이게 해줌
//            canvas.translate(-150, 200);
        //크기
        //canvas.scale(2,2,cx, cy);
        //비틀기
        canvas.skew(0.4f, 0.4f);
        canvas.drawBitmap(picture, x, y, null);
    }
}
