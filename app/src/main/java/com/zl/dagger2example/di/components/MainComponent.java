package com.zl.dagger2example.di.components;

import com.zl.dagger2example.di.modules.MainModule;
import com.zl.dagger2example.di.scopes.ActivityScope;
import com.zl.dagger2example.ui.MainActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by weilu on 2016/1/26.
 */
@ActivityScope
@Subcomponent(modules = {MainModule.class})
public interface MainComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {}

}

