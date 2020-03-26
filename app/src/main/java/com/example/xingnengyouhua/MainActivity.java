package com.example.xingnengyouhua;

import com.example.xingnengyouhua.activity.MemoryShakeActivity;

import java.util.ArrayList;

import apis.amapv2.com.listviewlibrary.activity.BaseListActivty;
import apis.amapv2.com.listviewlibrary.bean.ItemObject;

public class MainActivity extends BaseListActivty {

    @Override
    protected void addData(ArrayList<ItemObject> data) {
        data.add(new ItemObject("内存抖动实例", MemoryShakeActivity.class));
    }
}
