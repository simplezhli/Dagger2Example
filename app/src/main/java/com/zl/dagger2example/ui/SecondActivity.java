package com.zl.dagger2example.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.zl.dagger2example.MyApplication;
import com.zl.dagger2example.R;
import com.zl.dagger2example.bean.Login;
import com.zl.dagger2example.di.components.UserComponent;
import com.zl.dagger2example.di.qualifiers.User;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SecondActivity extends AppCompatActivity {

    UserComponent userComponent;

    @Inject
    @User
    Login xiaoming;

    @Inject
    Login xiaoguan;

    @Bind(R.id.button4)
    Button mButton4;

    @Bind(R.id.button5)
    Button mButton5;

    Context app;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);

        userComponent = ((MyApplication)this.getApplication()).getUserComponent();
        userComponent.inject(this);

        app = ((MyApplication)this.getApplication()).getAppComponent().getAppContext();


    }
    @OnClick({
            R.id.button4,
            R.id.button5,
    })
    void onButtonClicked(View v) {
        switch (v.getId()) {
            case R.id.button4:
                Toast.makeText(this,xiaoming.getName() + "----" + xiaoming.getPassword(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Toast.makeText(this,xiaoguan.getName() + "----" + xiaoguan.getPassword(),Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
