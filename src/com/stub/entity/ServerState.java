package com.stub.entity;

import com.example.moskito_control_app_android.R;

/**
 * User: Olenka Shemshey
 * Date: 14.07.13
 */
public enum ServerState {
    RED, VIOLET, YELLOW, GREEN, ORANGE;

    public int getColorDrawable(ServerState state) {
        switch (state){
            case RED:
                return R.drawable.red;
            case VIOLET:
                return R.drawable.violet;
            case YELLOW:
                return R.drawable.yellow;
            case GREEN:
                return R.drawable.green;
            case ORANGE:
                //fall through
            default:
                return R.drawable.orange;
        }
    }
}