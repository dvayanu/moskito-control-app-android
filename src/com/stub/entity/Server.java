package com.stub.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * User: Olenka Shemshey
 * Date: 13.07.13
 */
public class Server implements Serializable {
    private String name;
    private String info;
    private Date date;
    private ServerState state;

    public Server(String name, String info, Date date, ServerState state) {
        this.name = name;
        this.info = info;
        this.date = date;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ServerState getState() {
        return state;
    }

    public void setState(ServerState state) {
        this.state = state;
    }
}

