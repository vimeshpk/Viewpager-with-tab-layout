package com.example.vimesh.myapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by vimesh on 01/02/17.
 */

public class ListAdapter extends BaseAdapter {

    Context context;
    List<Test> rowItems;

    public ListAdapter(Context context, List<Test> items) {
        this.context = context;
        this.rowItems = items;
    }

    /*private view holder class*/
    private class ViewHolder {

        TextView txtTitle;

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;

        LayoutInflater mInflater = (LayoutInflater)
                context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_item, null);
            holder = new ViewHolder();

            holder.txtTitle = (TextView) convertView.findViewById(R.id.text);

            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }

        Test rowItem = (Test) getItem(position);


        holder.txtTitle.setText(rowItem.getName());


        return convertView;
    }

    @Override
    public int getCount() {
        return rowItems.size();
    }

    @Override
    public Object getItem(int position) {
        return rowItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return rowItems.indexOf(getItem(position));
    }
}
