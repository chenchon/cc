package com.bawei.chenchong20190308.bean;

/**
 * @Author：陈冲
 * @E-mail： 1586503085@qq.com
 * @Date：2019/3/8 9:49
 * @Description：描述信息
 */
public class One {
  /*
  *  "commodityId": 5,
                    "commodityName": "双头两用修容笔",
                    "masterPic": "http://172.17.8.100/images/small/commodity/mzhf/cz/3/1.jpg",
                    "price": 39,
                    "saleNum": 156*/
  private String commodityId;
  private String commodityName;
  private String masterPic;
  private String price;
  private String saleNum;

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getMasterPic() {
        return masterPic;
    }

    public void setMasterPic(String masterPic) {
        this.masterPic = masterPic;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(String saleNum) {
        this.saleNum = saleNum;
    }

    @Override
    public String toString() {
        return "One{" +
                "commodityId='" + commodityId + '\'' +
                ", commodityName='" + commodityName + '\'' +
                ", masterPic='" + masterPic + '\'' +
                ", price='" + price + '\'' +
                ", saleNum='" + saleNum + '\'' +
                '}';
    }
}
