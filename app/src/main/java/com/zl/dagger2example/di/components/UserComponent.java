package com.zl.dagger2example.di.components;

import com.zl.dagger2example.di.modules.UserModule;
import com.zl.dagger2example.di.scopes.ActivityScope;
import com.zl.dagger2example.ui.SecondActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by weilu on 2016/1/27.
 */
@ActivityScope
@Subcomponent(modules = {UserModule.class})
public interface UserComponent extends AndroidInjector<SecondActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SecondActivity> {}

}
