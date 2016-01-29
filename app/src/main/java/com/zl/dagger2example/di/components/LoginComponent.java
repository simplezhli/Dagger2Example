package com.zl.dagger2example.di.components;

import com.zl.dagger2example.MyApplication;
import com.zl.dagger2example.di.modules.LoginModule;
import com.zl.dagger2example.di.scopes.LoginScope;

import dagger.Component;

/**
 * Created by weilu on 16/1/27.
 */
@LoginScope
@Component(modules = {
        LoginModule.class
})
public interface LoginComponent {
    void inject(MyApplication myApplication);
}
