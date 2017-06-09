package com.zl.dagger2example.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.zl.dagger2example.MyApplication;
import com.zl.dagger2example.R;
import com.zl.dagger2example.bean.Person;
import com.zl.dagger2example.di.components.DaggerMainComponent;
import com.zl.dagger2example.di.components.MainComponent;
import com.zl.dagger2example.di.modules.MainModule;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button1)
    Button mButton1;
    @BindView(R.id.button2)
    Button mButton2;
    @BindView(R.id.button3)
    Button mButton3;

    private final String KEY = "Dagger 2";

    private MainComponent mComponent;

    @Inject
    Person mPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mComponent = DaggerMainComponent.builder()
                .appComponent(((MyApplication)this.getApplication()).getAppComponent())
                .mainModule(new MainModule())
                .build();

        mComponent.inject(this);
    }

    @OnClick({R.id.button1, R.id.button2, R.id.button3})
    public void onViewClicked(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Toast.makeText(this, mComponent.execute().getStorage(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this, mPerson.getName() + "----" + mPerson.getAge(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
        }
    }

}
