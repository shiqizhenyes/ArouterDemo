package com.example.arouterdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;



//@Route(path = "/test/SecondActivity")
public class SecondActivity extends AppCompatActivity {


//    @Autowired
//    String name;
//    @Autowired
//    int age;
//    @Autowired(name = "girl")
//    boolean boy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
//        ARouter.getInstance().inject(this);

//        Log.d(SecondActivity.class.getSimpleName(), "name: " + name + "age: " + age + "boy: " + boy);
    }
}
