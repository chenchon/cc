package com.bawei.chenchong20190308.fragment;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

import com.bawei.chenchong20190308.Ping;
import com.bawei.chenchong20190308.R;
import com.bawei.chenchong20190308.base.BaseFragment;
import com.bawei.chenchong20190308.item.item1;
import com.bawei.chenchong20190308.item.item2;
import com.bawei.chenchong20190308.item.item3;
import com.bawei.chenchong20190308.item.item4;
import com.bawei.chenchong20190308.item.item5;

import java.util.ArrayList;

/**
 * @Author：陈冲
 * @E-mail： 1586503085@qq.com
 * @Date：2019/3/8 9:07
 * @Description：描述信息
 */
public class Frag1 extends BaseFragment {
    private ViewPager pager;
    private ArrayList<Fragment> list;
    private ArrayList<String> list1;
    private TabLayout tab;
    private Button btna;

    @Override
    protected int bindLayout() {
        return R.layout.frag1;
    }

    @Override
    protected void initView() {
        pager = bindView(R.id.viewpager);
        tab = bindView(R.id.tab);
        btna = bindView(R.id.btna);
    }

    @Override
    protected void initData() {
        list = new ArrayList<>();
        list.add(new item1());
        list.add(new item2());
        list.add(new item3());
        list.add(new item4());
        list.add(new item5());
        list1 = new ArrayList<>();
        list1.add("关注");
        list1.add("推荐");
        list1.add("热点");
        list1.add("北京");
        list1.add("视频");
        pager.setAdapter(new FragmentPagerAdapter(getFragmentManager()) {
            @Override
            public Fragment getItem(int i) {
                return list.get(i);
            }

            @Override
            public int getCount() {
                return list.size();
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return list1.get(position);
            }
        });
        tab.setupWithViewPager(pager);
    }

    @Override
    protected void initEvent() {
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Ping.class);
                startActivity(intent);
            }
        });
    }
}
