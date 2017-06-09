package com.zl.dagger2example.di.components;

import com.zl.dagger2example.di.modules.UserModule;
import com.zl.dagger2example.ui.SecondActivity;

import dagger.Component;

/**
 * Created by weilu on 2016/1/27.
 */
@Component(modules = {UserModule.class})
public interface UserComponent {
    void inject(SecondActivity mSecondActivity);
}
