package com.zl.dagger2example.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.zl.dagger2example.R;
import com.zl.dagger2example.bean.Person;
import com.zl.dagger2example.utils.Storage;

import javax.inject.Inject;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.AndroidInjection;
import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {

    @BindView(R.id.button1)
    Button mButton1;
    @BindView(R.id.button2)
    Button mButton2;
    @BindView(R.id.button3)
    Button mButton3;
    @BindView(R.id.button4)
    Button mButton4;

    private final String KEY = "Dagger 2";

    @Inject
    Person mPerson;
    @Inject
    Storage mStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mStorage.storage();
    }

    @OnClick({R.id.button1, R.id.button2, R.id.button3, R.id.button4})
    public void onViewClicked(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Toast.makeText(this, mStorage.getStorage(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this, mPerson.getName() + "----" + mPerson.getAge(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
            case R.id.button4:
                Intent intent1 = new Intent(this, ContributesActivity.class);
                startActivity(intent1);
                break;
        }
    }

}
