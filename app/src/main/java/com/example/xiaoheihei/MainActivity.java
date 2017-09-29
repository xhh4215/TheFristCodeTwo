package com.example.xiaoheihei;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayAdapter adapter;
    String[] datas = new String[]{"message 01","message 02","message 03","message 04","message 04"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listviewid);
        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,datas);
        listView.setAdapter(adapter);

    }
}
