package com.bawei.chenchong20190308;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.chenchong20190308.bean.JsonBean;
import com.bawei.chenchong20190308.bean.One;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：陈冲
 * @E-mail： 1586503085@qq.com
 * @Date：2019/3/8 9:59
 * @Description：适配器
 */
public class MyAdapter extends BaseAdapter {
    private List<One> list;
    private Context context;

    public MyAdapter(List<One> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        int type = getItemViewType(position);
        switch (type) {
            case 0:
                ViewHolder1 holder1 = null;
                if (convertView == null) {
                    convertView = View.inflate(context, R.layout.item2, null);
                    holder1 = new ViewHolder1();
                    holder1.imageView1 = convertView.findViewById(R.id.ima1);
                    holder1.textView1 = convertView.findViewById(R.id.text1);
                    convertView.setTag(holder1);
                } else {
                holder1 = (ViewHolder1) convertView.getTag();
            }
            One one = list.get(position);
            holder1.textView1.setText(one.getCommodityName());
            Glide.with(context).load(one.getMasterPic()).into(holder1.imageView1);
            break;
            case 1:
                ViewHolder2 holder2 = null;
                if (convertView == null) {
                    convertView = View.inflate(context, R.layout.frag4, null);
                    holder2= new ViewHolder2();
                    holder2.imageView2 = convertView.findViewById(R.id.img2);
                    holder2.textView2 = convertView.findViewById(R.id.text2);
                    convertView.setTag(holder2);
                } else {
                    holder2 = (ViewHolder2) convertView.getTag();
                }
                One one1 = list.get(position);
                holder2.textView2.setText(one1.getCommodityName());
                Glide.with(context).load(one1.getMasterPic()).into(holder2.imageView2);
                break;
            case 2:
                ViewHolder3 holder3 = null;
                if (convertView == null) {
                    convertView = View.inflate(context, R.layout.frag5, null);
                    holder3= new ViewHolder3();
                    holder3.imageView4= convertView.findViewById(R.id.ima3);
                    holder3.textView3 = convertView.findViewById(R.id.text3);
                    convertView.setTag(holder3);
                } else {
                    holder3 = (ViewHolder3) convertView.getTag();
                }
                One one2 = list.get(position);
                holder3.textView3.setText(one2.getCommodityName());
                Glide.with(context).load(one2.getMasterPic()).into(holder3.imageView4);
                break;
        }
        return convertView;
    }
    class ViewHolder1{
        TextView textView1;
        ImageView imageView1;
    }
  class ViewHolder2{
        TextView textView2;
        ImageView imageView2;
    }
    class ViewHolder3 {
        TextView textView3;
        ImageView imageView4;
    }

    @Override
    public int getViewTypeCount() {
        return 3;
    }

    @Override
    public int getItemViewType(int position) {
        return position%3;
    }
}
