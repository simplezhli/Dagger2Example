package com.zl.dagger2example.di.components;

import com.zl.dagger2example.di.modules.UserModule;
import com.zl.dagger2example.ui.SecondActivity;

import dagger.Subcomponent;

/**
 * Created by weilu on 2016/1/27.
 */
@Subcomponent(modules = {
        UserModule.class
})
public interface UserComponent {
    void inject(SecondActivity mSecondActivity);
}
