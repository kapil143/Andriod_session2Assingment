package com.example.kapil.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView image;
    private Button mButton;
    private Boolean aBoolean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image= (TextView) findViewById(R.id.imageview);
        mButton= (Button) findViewById(R.id.button);
        aBoolean=true;

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aBoolean){
                    image.setVisibility(View.GONE);
                    mButton.setText("Show");
                    aBoolean=false;
                }
                else{
                    image.setVisibility(View.VISIBLE);
                    mButton.setText("hide");
                    aBoolean=true;
                }
            }
        });
    }
}

