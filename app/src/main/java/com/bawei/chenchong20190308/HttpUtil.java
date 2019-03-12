package com.bawei.chenchong20190308;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Author：陈冲
 * @E-mail： 1586503085@qq.com
 * @Date：2019/3/8 8:50
 * @Description：描述信息
 */
public class HttpUtil {
    //判断上下文不等于空
    public static boolean isNet(Context context){
        if (context!=null){
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if (networkInfo!=null){
                    return networkInfo.isAvailable();
                }
        }
        return false;
    }
    public static String getHttp(String strUrl){
        try {
            URL url = new URL(strUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setReadTimeout(5000);
            connection.setConnectTimeout(5000);
            InputStream stream = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            StringBuilder builder = new StringBuilder();
            String str = "";
            if ((str=reader.readLine())!=null){
                builder.append(str);
            }
            return builder.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    public interface CallBacks{
        void getData(String s);
    }
    public static void getAsynet(String url, final CallBacks backs){
        new AsyncTask<String,Void,String>(){
            @Override
            protected String doInBackground(String... strings) {
                return getHttp(strings[0]);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                backs.getData(s);
            }
        }.execute(url);
    }
}
