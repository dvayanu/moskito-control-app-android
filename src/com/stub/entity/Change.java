package com.stub.entity;

import android.graphics.Color;

import java.io.Serializable;
import java.util.Date;

/**
 * User: Olenka Shemshey
 * Date: 13.07.13
 */
public class Change implements Serializable{
    private Server server;
    private int oldColor;
    private int newColor;
    private Date date;


    public Change(Server server, int oldColor, int newColor, Date date) {
        this.server = server;
        this.oldColor = oldColor;
        this.newColor = newColor;
        this.date = date;
    }

    public Server getServer() {
        return server;
    }

    public int getOldColor() {
        return oldColor;
    }

    public int getNewColor() {
        return newColor;
    }

    public Date getDate() {
        return date;
    }
}
