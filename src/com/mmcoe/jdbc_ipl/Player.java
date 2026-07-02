package com.mmcoe.jdbc_ipl;

public class Player {

    private String name;
    private long price;

    public Player() {
    }

    public Player(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Player Name : " + name + " | Price : " + price;
    }

}