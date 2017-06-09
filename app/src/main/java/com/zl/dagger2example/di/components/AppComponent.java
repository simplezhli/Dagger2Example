package com.zl.dagger2example.di.components;

import com.zl.dagger2example.MyApplication;
import com.zl.dagger2example.di.modules.AppModule;
import com.zl.dagger2example.di.modules.BuildersModule;
import com.zl.dagger2example.di.modules.StorageModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by weilu on 2016/1/27.
 */
@Singleton
@Component(modules = {
        AppModule.class,
        StorageModule.class,
        BuildersModule.class,
        AndroidSupportInjectionModule.class
})
interface AppComponent extends AndroidInjector<MyApplication>{

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MyApplication> {}

}
