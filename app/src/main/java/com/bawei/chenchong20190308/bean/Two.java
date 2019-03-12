package com.bawei.chenchong20190308.bean;

import java.util.ArrayList;

/**
 * @Author：陈冲
 * @E-mail： 1586503085@qq.com
 * @Date：2019/3/8 9:56
 * @Description：描述信息
 */
public class Two {
    private ArrayList<One> commodityList;

    public ArrayList<One> getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(ArrayList<One> commodityList) {
        this.commodityList = commodityList;
    }

    @Override
    public String toString() {
        return "Two{" +
                "commodityList=" + commodityList +
                '}';
    }
}
