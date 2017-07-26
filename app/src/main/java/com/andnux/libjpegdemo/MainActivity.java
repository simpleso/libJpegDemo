package com.andnux.libjpegdemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.andnux.libjpeg.JpegNative;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            InputStream stream = getAssets().open("a.jpg");
            File file = new File(Environment.getExternalStorageDirectory(), "b.jpg");
            File fo = new File(Environment.getExternalStorageDirectory(), "a.jpg");
            FileOutputStream fos = new FileOutputStream(fo);
            byte buff[] = new byte[1024 * 10];
            int lenth;
            while ((lenth = stream.read(buff)) != -1) {
                fos.write(buff,0,lenth);
            }
            fos.flush();
            fos.close();
            Bitmap bitmap1 = BitmapFactory.decodeStream(stream);
            ImageView imageView1 = (ImageView) findViewById(R.id.image1);
            imageView1.setImageBitmap(bitmap1);
            String path = file.getAbsolutePath();
            JpegNative.compress(bitmap1, 50, path, true);
            Bitmap bitmap2 = BitmapFactory.decodeFile(path);
            ImageView imageView2 = (ImageView) findViewById(R.id.image2);
            imageView2.setImageBitmap(bitmap2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
