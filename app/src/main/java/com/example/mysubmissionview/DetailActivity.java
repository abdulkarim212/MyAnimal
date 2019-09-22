package com.example.mysubmissionview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        TextView name = (TextView) findViewById(R.id.tvname);
        ImageView img = (ImageView) findViewById(R.id.img_item_photo) ;
        TextView detail = (TextView) findViewById(R.id.tvdetail);
        name.setText(getIntent().getStringExtra("namahewan"));
        detail.setText(getIntent().getStringExtra("detailhewan"));
        int imglink = getIntent().getIntExtra("imghewan", 0);
        img.setImageResource(imglink);

    }
}
