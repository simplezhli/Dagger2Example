package com.zl.dagger2example.interfaces;

import android.util.Log;

/**
 * Created by weilu on 2016/1/26.
 */
public class ScheduleImpl implements Schedule{

    private String TAG = "Dagger 2";
    public ScheduleImpl() {
    }

    @Override
    public void start() {
        Log.w(TAG,"----------储存开始----------");
    }

    @Override
    public void end() { Log.w(TAG,"----------储存结束----------");  }
}
