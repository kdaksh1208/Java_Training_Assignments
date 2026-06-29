package com.mmcoe.IPL_Assignment;

public class Player {
	private String name;
	private long price;
	
	public Player() {		
	}

	public Player(String name, long price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(long price) {
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
		return "Player [name=" + name + ", price=" + price + "]";
	}
	
	
	
}
	
	
