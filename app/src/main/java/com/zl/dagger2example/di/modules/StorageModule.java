package com.zl.dagger2example.di.modules;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by weilu on 2016/1/26.
 */
@Module
public class StorageModule {

    private Application application;

    public StorageModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    SharedPreferences provideSharedPreferences(){
        return PreferenceManager.getDefaultSharedPreferences(application);
    }

}
