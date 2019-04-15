package com.example.arouterdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.testlibrary.ThirdActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button jumpToSecond;
    Button jumpToTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jumpToSecond = findViewById(R.id.jumpToSecond);
        jumpToTest = findViewById(R.id.jumpToTest);
        jumpToSecond.setOnClickListener(this);
        jumpToTest.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
//
//        Intent intent = new Intent(this, ThirdActivity.class);
//        startActivity(intent);

//        ARouter.getInstance().build("/test/SecondActivity").withString("name","zack")
//                .withInt("age",12).withBoolean("girl",true).navigation();
        ARouter.getInstance().build("/testLibrary/ThirdActivity")
                .withInt("age",1).withString("name","zack").navigation();

    }
}
