package com.zl.dagger2example.di.modules;

import com.zl.dagger2example.interfaces.ScheduleImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by weilu on 2016/1/26.
 */
@Module
public class MainModule {

    @Provides
    ScheduleImpl provideSchedule() {
        return new ScheduleImpl();
    }
}
