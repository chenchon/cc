package com.bawei.chenchong20190308.item;

import android.widget.Adapter;
import android.widget.ListView;

import com.bawei.chenchong20190308.HttpUtil;
import com.bawei.chenchong20190308.MyAdapter;
import com.bawei.chenchong20190308.R;
import com.bawei.chenchong20190308.base.BaseFragment;
import com.bawei.chenchong20190308.bean.JsonBean;
import com.bawei.chenchong20190308.bean.One;
import com.bawei.chenchong20190308.bean.Three;
import com.google.gson.Gson;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：陈冲
 * @E-mail： 1586503085@qq.com
 * @Date：2019/3/8 9:28
 * @Description：描述信息
 */
public class item1 extends BaseFragment {
    private ArrayList<One> list2;

    private PullToRefreshListView pull;
    private String url = "http://172.17.8.100/small/commodity/v1/commodityList";
    private MyAdapter adapter;
    private ArrayList<One> list1;
    @Override
    protected int bindLayout() {
        return R.layout.item1;
    }

    @Override
    protected void initView() {

        pull = bindView(R.id.pull);
        pull.setMode(PullToRefreshBase.Mode.BOTH);
        pull.setPullToRefreshOverScrollEnabled(true);
//上拉下拉
        pull.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ListView>() {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {
                if (HttpUtil.isNet(getActivity())){
                    HttpUtil.getAsynet(url, new HttpUtil.CallBacks() {
                        @Override
                        public void getData(String s) {
                            Gson gson = new Gson();
                            JsonBean bean = gson.fromJson(s, JsonBean.class);
                            Three result = bean.getResult();
                            ArrayList<One> one1 = result.getMlss().getCommodityList();
                            ArrayList<One> one2 = result.getMlss().getCommodityList();
                            ArrayList<One> one3 = result.getMlss().getCommodityList();
                            list1 = new ArrayList<>();
                            list1.addAll(one1);
                            list1.addAll(one2);
                            list1.addAll(one3);
                            adapter = new MyAdapter(list1, getActivity());
                            pull.setAdapter(adapter);
                            pull.onRefreshComplete();
                        }
                    });
                }
            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {
                if (HttpUtil.isNet(getActivity())) {
                    HttpUtil.getAsynet(url, new HttpUtil.CallBacks() {
                        @Override
                        public void getData(String s) {
                            Gson gson = new Gson();
                            JsonBean bean = gson.fromJson(s, JsonBean.class);
                            Three result = bean.getResult();
                            ArrayList<One> one1 = result.getMlss().getCommodityList();
                            ArrayList<One> one2 = result.getMlss().getCommodityList();
                            ArrayList<One> one3 = result.getMlss().getCommodityList();
                            list1 = new ArrayList<>();
                            list1.addAll(one1);
                            list1.addAll(one2);
                            list1.addAll(one3);
                            list2 = new ArrayList<>();
                            list2.addAll(list1);
                            adapter = new MyAdapter(list1, getActivity());
                            pull.setAdapter(adapter);
                            pull.onRefreshComplete();
                        }
                    });
                }
            }
        });
    }
//解析
    @Override
    protected void initData() {

        HttpUtil.getAsynet(url, new HttpUtil.CallBacks() {
            @Override
            public void getData(String s) {
                Gson gson = new Gson();
                JsonBean bean = gson.fromJson(s, JsonBean.class);
                Three result = bean.getResult();
                ArrayList<One> one1 = result.getMlss().getCommodityList();
                ArrayList<One> one2 = result.getMlss().getCommodityList();
                ArrayList<One> one3 = result.getMlss().getCommodityList();
                list1 = new ArrayList<>();
                list1.addAll(one1);
                list1.addAll(one2);
                list1.addAll(one3);
                adapter = new MyAdapter(list1, getActivity());
                pull.setAdapter(adapter);
            }
        });
    }

    @Override
    protected void initEvent() {

    }
}
