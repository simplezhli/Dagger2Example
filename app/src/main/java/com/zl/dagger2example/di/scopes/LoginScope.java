package com.zl.dagger2example.di.scopes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by weilu on 2016/1/26.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginScope {

}
