package com.example.kentsimgeleri;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class cityDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_detail);

        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        TextView textView = (TextView) findViewById(R.id.textView2);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");

        textView.setText(name);

        //imageView.setImageBitmap(MainActivity.selectedImage);

        Globals globals = Globals.getInstance();
        Bitmap bitmap = globals.getData();

        imageView.setImageBitmap(bitmap);



    }
}
