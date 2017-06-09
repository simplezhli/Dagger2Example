package com.zl.dagger2example.di.components;

import android.content.Context;
import android.content.SharedPreferences;

import com.zl.dagger2example.di.modules.AppModule;
import com.zl.dagger2example.di.modules.StorageModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by weilu on 2016/1/27.
 */
@Singleton
@Component(modules = {
        AppModule.class,
        StorageModule.class,
})
public interface AppComponent {

    Context getAppContext();

    SharedPreferences getSharedPreferences();
}
