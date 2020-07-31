package com.task.model;

public class Containers {
	
	private Integer containerId;
	
	private String container;
	
	private Integer maxCapacity;
	
	private float availability;
	
	

	public Containers() {
		super();
	}



	public Containers(Integer containerId, String container, Integer maxCapacity, float availability) {
		super();
		this.containerId = containerId;
		this.container = container;
		this.maxCapacity = maxCapacity;
		this.availability = availability;
	}

	


	public Integer getContainerId() {
		return containerId;
	}



	public void setContainerId(Integer containerId) {
		this.containerId = containerId;
	}



	public String getContainer() {
		return container;
	}



	public void setContainer(String container) {
		this.container = container;
	}



	public Integer getMaxCapacity() {
		return maxCapacity;
	}



	public void setMaxCapacity(Integer maxCapacity) {
		this.maxCapacity = maxCapacity;
	}



	public float getAvailability() {
		return availability;
	}



	public void setAvailability(float availability) {
		this.availability = availability;
	}



	@Override
	public String toString() {
		return "Containers [containerId=" + containerId + ", container=" + container + ", maxCapacity=" + maxCapacity
				+ ", availability=" + availability + "]";
	}
	
		

}
