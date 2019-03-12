package com.bawei.chenchong20190308.fragment;

import android.widget.ImageView;

import com.bawei.chenchong20190308.R;
import com.bawei.chenchong20190308.base.BaseFragment;
import com.bumptech.glide.Glide;

/**
 * @Author：陈冲
 * @E-mail： 1586503085@qq.com
 * @Date：2019/3/8 9:07
 * @Description：描述信息
 */
public class Frag2 extends BaseFragment {
    private String url = "http://img.365jia.cn/uploads/special/tuku/201806/5b247f05646c345194.jpg";
    @Override
    protected int bindLayout() {
        return R.layout.frag2;
    }

    @Override
    protected void initView() {
    ImageView imageView = bindView(R.id.nnn);
            Glide.with(getActivity()).load(url).into(imageView);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initEvent() {

    }
}
