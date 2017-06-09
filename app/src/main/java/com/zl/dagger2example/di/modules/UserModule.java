package com.zl.dagger2example.di.modules;

import com.zl.dagger2example.bean.Login;
import com.zl.dagger2example.di.qualifiers.User;

import dagger.Module;
import dagger.Provides;

/**
 * Created by weilu on 2016/1/27.
 */
@Module
public class UserModule {

    @Provides
    @User
    Login provideXiaoMingUser() {
        Login xiaomin = new Login();
        xiaomin.setPassword("******");
        xiaomin.setName("小明");
        return xiaomin;
    }

    @Provides
    Login provideXiaoGuanUser() {
        Login xiaoguan = new Login();
        xiaoguan.setPassword("######");
        xiaoguan.setName("小关");
        return xiaoguan;
    }
}
