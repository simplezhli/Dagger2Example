package com.zl.dagger2example;

import android.app.Application;
import com.zl.dagger2example.di.components.AppComponent;
import com.zl.dagger2example.di.components.DaggerAppComponent;
import com.zl.dagger2example.di.modules.AppModule;
import com.zl.dagger2example.di.modules.StorageModule;

/**
 * Created by weilu on 2016/1/26.
 */
public class MyApplication extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .storageModule(new StorageModule(this))
                .build();

    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

}