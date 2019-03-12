package com.bawei.chenchong20190308.base;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.bawei.chenchong20190308.R;

/**
 * @Author：陈冲
 * @E-mail： 1586503085@qq.com
 * @Date：2019/3/8 8:41
 * @Description：抽基类BaseActivity
 */
public abstract class BaseActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(bindLayout());
        initView();
        initData();
        initEvent();
    }
    protected abstract int bindLayout();
    protected abstract void initView();
    protected abstract void initData();
    protected abstract void initEvent();

    protected <T extends View> T bindview(int resit){
        return findViewById(resit);
    }
}
