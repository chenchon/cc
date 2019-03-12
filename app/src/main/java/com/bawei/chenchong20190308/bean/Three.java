package com.bawei.chenchong20190308.bean;

/**
 * @Author：陈冲
 * @E-mail： 1586503085@qq.com
 * @Date：2019/3/8 11:19
 * @Description：描述信息
 */
public class Three {
    private Two mlss;
    private Two pzsh;
    private Two rxxp;

    public Two getMlss() {
        return mlss;
    }

    public void setMlss(Two mlss) {
        this.mlss = mlss;
    }

    public Two getPzsh() {
        return pzsh;
    }

    public void setPzsh(Two pzsh) {
        this.pzsh = pzsh;
    }

    public Two getRxxp() {
        return rxxp;
    }

    public void setRxxp(Two rxxp) {
        this.rxxp = rxxp;
    }

    @Override
    public String toString() {
        return "Three{" +
                "mlss=" + mlss +
                ", pzsh=" + pzsh +
                ", rxxp=" + rxxp +
                '}';
    }
}
