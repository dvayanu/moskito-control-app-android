package com.moskito;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.example.moskito_control_app_android.R;
import com.stub.entity.Application;
import com.stub.entity.Helper;

/**
 * User: Olenka Shemshey
 * Date: 13.07.13
 */
public class ApplicationsListActivity extends Activity {
    public static String KEY_APP;
    private static Helper mHelper;

    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.applications);
        obtainView();
        if (mHelper == null){
            mHelper = new Helper();
        }
        initializeList();
    }

    public void obtainView(){

    }

    public void initializeList(){
        AppAdapter sAdapter = new AppAdapter(this, mHelper.getAllApps());
        ListView lvSimple = (ListView) findViewById(R.id.app_list);
        lvSimple.setAdapter(sAdapter);
        lvSimple.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ApplicationsListActivity.this, ApplicationActivity.class);
                Bundle bundle = new Bundle();
                Application app = mHelper.getAllApps().get(position);
                bundle.putSerializable(KEY_APP, app);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
