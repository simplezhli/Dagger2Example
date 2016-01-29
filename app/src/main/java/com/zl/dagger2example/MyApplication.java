package com.zl.dagger2example;

import android.app.Application;

import com.zl.dagger2example.bean.Login;
import com.zl.dagger2example.bean.Person;
import com.zl.dagger2example.di.components.AppComponent;
import com.zl.dagger2example.di.components.DaggerAppComponent;
import com.zl.dagger2example.di.components.DaggerLoginComponent;
import com.zl.dagger2example.di.components.DaggerStorageComponent;
import com.zl.dagger2example.di.components.LoginComponent;
import com.zl.dagger2example.di.components.StorageComponent;
import com.zl.dagger2example.di.components.UserComponent;
import com.zl.dagger2example.di.modules.AppModule;
import com.zl.dagger2example.di.modules.LoginModule;
import com.zl.dagger2example.di.modules.StorageModule;
import com.zl.dagger2example.di.modules.UserModule;

import javax.inject.Inject;

/**
 * Created by weilu on 2016/1/26.
 */
public class MyApplication extends Application {

    private StorageComponent component;
    private AppComponent mAppComponent;
    private UserComponent mUserComponent;
    private LoginComponent mLoginComponent;

    @Inject
    Person mPerson;

    @Inject
    Login mLogin;
    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerStorageComponent
                .builder()
                .storageModule(new StorageModule(this))
                .build();

        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        mUserComponent = mAppComponent.createUserComponent(new UserModule());

        mLoginComponent = DaggerLoginComponent.builder()
                .loginModule(new LoginModule())
                .build();
        mLoginComponent.inject(this);

    }

    public StorageComponent getStorageComponent() {
        return component;
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    public UserComponent getUserComponent() { return mUserComponent;}

    public LoginComponent getLoginComponent() { return mLoginComponent;}

}