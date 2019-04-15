package com.example.arouterdemo;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

//import com.alibaba.android.arouter.launcher.ARouter;


public class ARouterApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
//            ARouter.openLog();
//            ARouter.openDebug();
        }
        ARouter.init(this);
    }
}
