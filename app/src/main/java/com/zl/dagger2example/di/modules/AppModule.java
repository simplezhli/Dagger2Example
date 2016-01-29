package com.zl.dagger2example.di.modules;

import android.content.Context;

import com.zl.dagger2example.MyApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by weilu on 2016/1/27.
 */
@Module
public class AppModule {

    private final MyApplication application;

    public AppModule(MyApplication application) {
        this.application = application;
    }
    @Provides
    @Singleton
    public Context provideContext() {
        return application;
    }
}
