package com.example.lh.gittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv_show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_show = (TextView) findViewById(R.id.tv_show);
        setFeature3();
    }
    private void setText(){
        tv_show.setText("hello bug");
    }
    private void setFeature2(){
        tv_show.setText("hello Feature2");
    }
    private void setFeature3(){
        tv_show.setText("hello Feature3");
    }
}
