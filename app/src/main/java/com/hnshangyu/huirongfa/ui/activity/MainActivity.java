package com.hnshangyu.huirongfa.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TabHost;

import com.hnshangyu.huirongfa.R;
import com.hnshangyu.huirongfa.ui.fragment.IndexFragment;
import com.hnshangyu.huirongfa.ui.fragment.LiveFragment;
import com.hnshangyu.huirongfa.ui.fragment.MineFragment;
import com.hnshangyu.huirongfa.ui.widget.CustomFragmentTabHost;



/**
 * Created by lishuai on 2016/10/28.
 */

public class MainActivity extends AppCompatActivity {
private CustomFragmentTabHost host;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        host = (CustomFragmentTabHost) findViewById(R.id.tabs);

        //containId 放置Fragment的容器id
        host.setup(MainActivity.this,getSupportFragmentManager(),R.id.tabContent);


        TabHost.TabSpec tmp =  host.newTabSpec("0");
        //自定义控件的UI
        View inflate = LayoutInflater.from(this).inflate(R.layout.view_index, null);
        tmp.setIndicator(inflate);
        //添加标签到tabhost中
        host.addTab(tmp, IndexFragment.class,null);



        TabHost.TabSpec tmp1 =  host.newTabSpec("1");
        //自定义控件的UI
        View inflate1 = LayoutInflater.from(this).inflate(R.layout.view_cnlive, null);
        tmp1.setIndicator(inflate1);
        //添加标签到tabhost中
        host.addTab(tmp1, LiveFragment.class,null);


        TabHost.TabSpec tmp2 = host.newTabSpec("2");
        View inflate2 = LayoutInflater.from(this).inflate(R.layout.view_mine, null);
        tmp2.setIndicator(inflate2);

        host.addTab(tmp2, MineFragment.class,null);

        host.setCurrentTabByTag("1");








    }
}
