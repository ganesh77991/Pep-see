package com.task.model;

public class Drink {
	
	private String drinkName;
	
	private Integer noOfCups;
	
	private float cost;
	
	

	public Drink() {
		super();
	}

	public Drink(String drinkName, Integer noOfCups, float cost) {
		super();
		this.drinkName = drinkName;
		this.noOfCups = noOfCups;
		this.cost = cost;
	}

	public String getDrinkName() {
		return drinkName;
	}

	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}

	public Integer getNoOfCups() {
		return noOfCups;
	}

	public void setNoOfCups(Integer noOfCups) {
		this.noOfCups = noOfCups;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Drink [drinkName=" + drinkName + ", noOfCups=" + noOfCups + ", cost=" + cost + "]";
	}
	
	

}
