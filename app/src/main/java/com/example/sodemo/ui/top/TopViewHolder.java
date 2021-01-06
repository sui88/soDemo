package com.example.sodemo.ui.top;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sodemo.R;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TopViewHolder  extends BaseViewHolder<TopData> {


    @BindView(R.id.title)
    TextView mTitle;
    @BindView(R.id.context)
    TextView mCotext;

    public TopViewHolder(ViewGroup parent) {
            super((LayoutInflater.from(parent.getContext()).inflate(R.layout.top_item, parent, false)));

            ButterKnife.bind(this, itemView);
    }

    @Override
    public void setData(TopData data) {
        super.setData(data);


        mTitle.setText(data.getTitle());
        mCotext.setText(data.getContext());

        Log.d("-------测试view--------",data.getTitle());
        Log.d("-------测试view--------",data.getContext());
    }

}