package com.example.technojampremembership;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView toGenerate;
    TextView fromGenerate;
    TextView wishGenerate;
    String toDisplay;
    String fromDisplay;
    String wishDisplay;
    ImageView mlinear;
    String mImageURI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        toGenerate=findViewById(R.id.toGenerate);
        fromGenerate=findViewById(R.id.fromGenerate);
        wishGenerate=findViewById(R.id.wishGenerate);
        mlinear = findViewById(R.id.Image);

        toDisplay=getIntent().getStringExtra("value");
        fromDisplay=getIntent().getStringExtra("value2");
        wishDisplay=getIntent().getStringExtra("value3");
        mImageURI =  getIntent().getStringExtra("URI_VALUE");

        fromGenerate.setText(fromDisplay);
        toGenerate.setText(toDisplay);
        wishGenerate.setText(wishDisplay);
        mlinear.setImageURI(Uri.parse(mImageURI));
    }
}
