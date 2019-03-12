package com.bawei.chenchong20190308.bean;

/**
 * @Author：陈冲
 * @E-mail： 1586503085@qq.com
 * @Date：2019/3/8 9:58
 * @Description：描述信息
 */
public class JsonBean {
   private Three result;

    public Three getResult() {
        return result;
    }

    public void setResult(Three result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "JsonBean{" +
                "result=" + result +
                '}';
    }
}
