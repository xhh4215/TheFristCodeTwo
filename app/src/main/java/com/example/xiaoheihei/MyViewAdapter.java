package com.example.xiaoheihei;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by xhh on 2017/9/29.
 */

public class MyViewAdapter extends ArrayAdapter<DataBean> {
    private int resourceId;

    public MyViewAdapter(@NonNull Context context, @LayoutRes int resource, List<DataBean> beanList) {
        super(context, resource, beanList);
        resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;
        DataBean bean = getItem(position);
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.imageView = (ImageView) view.findViewById(R.id.imageviewid);
            viewHolder.textView = (TextView) view.findViewById(R.id.textid);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.textView.setText(bean.getName());
        viewHolder.imageView.setImageResource(bean.getImageid());

        return view;


    }

    class ViewHolder {
        public ImageView imageView;
        public TextView textView;
    }
}
