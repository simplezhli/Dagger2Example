package com.zl.dagger2example.di.components;

import android.content.Context;

import com.zl.dagger2example.di.modules.AppModule;
import com.zl.dagger2example.di.modules.UserModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by weilu on 2016/1/27.
 */
@Singleton
@Component(
        modules ={ AppModule.class
    }
)
public interface AppComponent {

    Context getAppContext();
    UserComponent createUserComponent(UserModule userModule);
}
