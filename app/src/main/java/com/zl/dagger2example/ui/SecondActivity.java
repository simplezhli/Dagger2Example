package com.zl.dagger2example.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.zl.dagger2example.R;
import com.zl.dagger2example.bean.Login;
import com.zl.dagger2example.di.components.DaggerUserComponent;
import com.zl.dagger2example.di.modules.UserModule;
import com.zl.dagger2example.di.qualifiers.User;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SecondActivity extends AppCompatActivity {

    @Inject
    @User
    Login xiaoming;

    @Inject
    Login xiaoguan;

    @BindView(R.id.button4)
    Button mButton4;

    @BindView(R.id.button5)
    Button mButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);

        DaggerUserComponent.builder()
                .userModule(new UserModule())
                .build()
                .inject(this);

    }
    @OnClick({
            R.id.button4,
            R.id.button5,
    })
    public void onViewClicked(View v) {
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
