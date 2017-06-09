package com.zl.dagger2example.di.components;

import com.zl.dagger2example.di.modules.MainModule;
import com.zl.dagger2example.di.scopes.ActivityScope;
import com.zl.dagger2example.ui.MainActivity;
import com.zl.dagger2example.utils.Storage;

import dagger.Component;

/**
 * Created by weilu on 2016/1/26.
 */
@ActivityScope
@Component(modules = {MainModule.class}, dependencies = {AppComponent.class})
public interface MainComponent {

    Storage execute();
    void inject(MainActivity mMainActivity);
}
