package com.stub.entity;

import android.graphics.Color;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Olenka Shemshey
 * Date: 13.07.13
 */
public class Application implements Serializable{
    private String name;
    private int color;
    private List<Server> servers;
    private List<Change> history;

    public Application(String name, int color) {
        this.name = name;
        this.color = color;
        servers = new ArrayList<Server>();
        history = new ArrayList<Change>();
    }

    public void addServer(Server server){
        servers.add(server);
    }

    public void addChange(Change change){
        history.add(change);
    }

    public String getName() {

        return name;
    }

    public int getColor() {
        return color;
    }

    public List<Server> getServers() {
        return servers;
    }

    public List<Change> getHistory() {
        return history;
    }
}
