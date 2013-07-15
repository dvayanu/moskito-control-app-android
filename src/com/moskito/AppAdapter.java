package com.moskito;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.moskito_control_app_android.R;
import com.stub.entity.Application;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Olenka Shemshey
 * Date: 13.07.13
 */
public class AppAdapter extends BaseAdapter {
    private List<Application> applications;
    private final Context context;

    public AppAdapter(Context context, List<Application> apps) {
        this.context = context;
        if (apps != null){
            this.applications = apps;
        } else {
            this.applications = new ArrayList<Application>();
        }
    }
    @Override
    public int getCount() {
        return applications.size();
    }

    @Override
    public Object getItem(int position) {
        return applications.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rootView = LayoutInflater.from(context).inflate(R.layout.app_list_item, parent, false);
        View appColor = (View) rootView.findViewById(R.id.app_color);
        TextView appName = (TextView) rootView.findViewById(R.id.app_name);

        Application application = (Application) getItem(position);
        //TODO set color
        appName.setText(application.getName());

        return rootView;
    }
}
