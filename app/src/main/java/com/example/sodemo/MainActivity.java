package com.example.sodemo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.sodemo.ui.top.TopAdapter;
import com.example.sodemo.ui.top.TopData;
import com.jude.easyrecyclerview.EasyRecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private TopAdapter topAdapter;

    @BindView(R.id.recycler)
    EasyRecyclerView mRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        ButterKnife.bind(this);

        List<TopData> fruitList = new ArrayList<>();

        //将Fruit中的getList的列表全部添加到fruitList中
        fruitList.addAll(TopData.getList());

        //实例化myAdapter并调用带参数的构造方法传一个fruitList的列表
        topAdapter = new TopAdapter(this);
        Log.d("-------测试view--------","topAdapter实列");

        //设置布局管理器为线性布局管理器
        mRecycler.setLayoutManager( new GridLayoutManager(this, 4));

        //设置分隔线
        // mRecycler.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        mRecycler.addItemDecoration(new MyDecoration());

        //设置适配器
        mRecycler.setAdapter(topAdapter);
        Log.d("-------测试view--------","设置适配器");

        topAdapter.addAll(fruitList);
//        topAdapter.addAll(TopData.getList());
        Log.d("-------测试view--------","topAdapteraddAll");

    }

    class MyDecoration extends RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            //outRect.set()中的参数分别对应左、上、右、下的间隔
            outRect.set(10,10,10,10);
        }
    }


}
