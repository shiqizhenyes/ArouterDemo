package com.example.testlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;


@Route(path = "/testLibrary/ThirdActivity")
public class ThirdActivity extends AppCompatActivity {

    @Autowired
    int age;
    @Autowired
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        ARouter.getInstance().inject(this);

        Log.d(ThirdActivity.class.getSimpleName(), name + age + "岁");
    }
}
