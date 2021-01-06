package com.example.sodemo.ui.top;


import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

public class TopAdapter extends RecyclerArrayAdapter<TopData> {

    public TopAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int position) {
        Log.d("-------测试view--------","------BaseViewHolder----");
        return new TopViewHolder(parent);
    }

}
