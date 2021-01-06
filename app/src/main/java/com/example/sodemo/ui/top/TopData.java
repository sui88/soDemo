package com.example.sodemo.ui.top;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TopData implements Serializable {
    private  String mTitle;
    private  String mContext;

    public TopData(String title,String context){
        mTitle  = title;
        mContext = context;
    }
    //这里是一个静态的方法，直接返回一个List<Fruit>列表
    public static List<TopData> getList() {
        List<TopData> fruitList = new ArrayList<>();
        //水果的名字
        String title[] = {
                "苹果", "香蕉", "蓝梅", "樱桃", "芒果", "梨子", "草莓",
                "苹果"
        };

        String context[] = {
                "苹果", "香蕉", "蓝梅", "樱桃", "芒果", "梨子", "草莓",
                "苹果"
        };

        //创建一个fruit的对象数组
        TopData fruit[] = new TopData[title.length];

        //为fruitList列表添加元素
        for (int i = 0; i < title.length; i++) {
            //给每一个fruit的元素实例化，并将name数组和imgId数组的值传入对应fruit元素的构造方法中
            fruit[i] = new TopData(title[i], context[i]);
            //将每一个数组元素分别添加到fruitList列表中
            fruitList.add(fruit[i]);
        }

        //最后返回一个List<Fruit>的列表
        return fruitList;
    }

    public void setContext(String mContext) {
        this.mContext = mContext;
    }

    public String getContext() {
        return mContext;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getTitle() {
        return mTitle;
    }
}
