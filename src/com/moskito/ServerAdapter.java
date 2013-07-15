package com.moskito;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.moskito_control_app_android.R;
import com.stub.entity.Server;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Olenka Shemshey
 * Date: 14.07.13
 */
public class ServerAdapter extends BaseAdapter{
    private List<Server> servers;
    private final Context context;

    public ServerAdapter(Context context, List<Server> servers) {
        this.context = context;
        if (servers != null){
            this.servers = servers;
        } else {
            this.servers = new ArrayList<Server>();
        }
    }
    @Override
    public int getCount() {
        return servers.size();
    }

    @Override
    public Object getItem(int position) {
        return servers.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rootView = LayoutInflater.from(context).inflate(R.layout.server_list_item, parent, false);

        View serverColor = (View) rootView.findViewById(R.id.server_color_state);
        TextView appName = (TextView) rootView.findViewById(R.id.server_name);

        Server server = (Server) getItem(position);

        //TODO appColor
        appName.setText(server.getName());

        return rootView;
    }
}
