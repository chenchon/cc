package com.bawei.chenchong20190308;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RadioGroup;

import com.bawei.chenchong20190308.base.BaseActivity;
import com.bawei.chenchong20190308.fragment.Frag1;
import com.bawei.chenchong20190308.fragment.Frag2;
import com.bawei.chenchong20190308.fragment.Frag3;
import com.bawei.chenchong20190308.fragment.Frag4;
import com.bawei.chenchong20190308.fragment.Frag5;

public class MainActivity extends BaseActivity {


    private FrameLayout fram;
    private RadioGroup group;
    private FragmentManager manager;
    private Frag1 frag1;
    private Frag2 frag2;
    private Frag3 frag3;
    private Frag4 frag4;
    private Frag5 frag5;

    @Override
    protected int bindLayout() {
        //找布局
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        //找控件
        fram = bindview(R.id.fram);
        group = bindview(R.id.group);
    }

    @Override
    protected void initData() {
        frag1 = new Frag1();
        frag2 = new Frag2();
        frag3 = new Frag3();
        frag4 = new Frag4();
        frag5 = new Frag5();
        manager = getSupportFragmentManager();
        manager.beginTransaction()
                .add(R.id.fram,frag1)
                .add(R.id.fram,frag2)
                .add(R.id.fram,frag3)
                .add(R.id.fram,frag4)
                .add(R.id.fram,frag5)
                .show(frag1)
                .hide(frag2)
                .hide(frag3)
                .hide(frag4)
                .hide(frag5)
                .commit();

    }

    @Override
    protected void initEvent() {
        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                FragmentTransaction transaction = manager.beginTransaction();
                switch (checkedId){
                    case R.id.btn1:
                        transaction.show(frag1)
                                .hide(frag2)
                                .hide(frag3)
                                .hide(frag4)
                                .hide(frag5);
                        break;
                    case R.id.btn2:
                        transaction.show(frag2)
                                .hide(frag1)
                                .hide(frag3)
                                .hide(frag4)
                                .hide(frag5);
                        break;
                    case R.id.btn3:
                        transaction.show(frag3)
                                .hide(frag2)
                                .hide(frag1)
                                .hide(frag4)
                                .hide(frag5);
                        break;
                    case R.id.btn4:
                        transaction.show(frag4)
                                .hide(frag2)
                                .hide(frag3)
                                .hide(frag1)
                                .hide(frag5);
                        break;
                    case R.id.btn5:
                        transaction.show(frag5)
                                .hide(frag2)
                                .hide(frag3)
                                .hide(frag4)
                                .hide(frag1);
                        break;
                }
                transaction.commit();
            }
        });
    }
}
