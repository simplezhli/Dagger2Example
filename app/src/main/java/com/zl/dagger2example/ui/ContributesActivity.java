package com.zl.dagger2example.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.zl.dagger2example.R;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.AndroidInjection;
import dagger.android.support.DaggerAppCompatActivity;

public class ContributesActivity extends DaggerAppCompatActivity {

    @Inject
    SharedPreferences mPreferences;

    private final String KEY = "name";

    @BindView(R.id.button1)
    Button mButton1;
    @BindView(R.id.button2)
    Button mButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contributes);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.button1, R.id.button2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.button1:
                mPreferences.edit().putString(KEY, "weilu").apply();
                Toast.makeText(this, "保存成功！", Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:
                Toast.makeText(this, mPreferences.getString(KEY, "null"), Toast.LENGTH_LONG).show();
                break;
        }
    }
}
