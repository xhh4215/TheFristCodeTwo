package com.example.xiaoheihei;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView;
    MyViewAdapter adapter;
    //    String[] datas = new String[]{"message 01","message 02","message 03","message 04","message 04"};
   private  List<DataBean> datas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listviewid);
//        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,datas);

        adapter = new MyViewAdapter(this, R.layout.listviewitem, getDatas(datas));
        listView.setOnItemClickListener(this);
        listView.setAdapter(adapter);

    }

    public List<DataBean> getDatas(List<DataBean> datas) {
        for (int i = 0; i < 2; i++) {
            datas.add(new DataBean("message1", R.mipmap.ic_launcher));
            datas.add(new DataBean("message2", R.mipmap.ic_launcher));
            datas.add(new DataBean("message3", R.mipmap.ic_launcher));
            datas.add(new DataBean("message4", R.mipmap.ic_launcher));
            datas.add(new DataBean("message5", R.mipmap.ic_launcher));
            datas.add(new DataBean("message6", R.mipmap.ic_launcher));
        }
        return datas;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
       DataBean bean =  datas.get(position);
        Toast.makeText(this, "您点击了"+bean.getName()+bean.getImageid(), Toast.LENGTH_SHORT).show();
    }
}
