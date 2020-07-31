package com.task.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import com.task.model.Containers;
import com.task.model.Drink;

@Repository
public class MachineDao {

	static Integer soda = 0;
	static Integer pepsi = 0;
	static Integer cheese = 0;
	static Integer pen = 0;

	public void getSoda(Integer noOfCups) {
		
		System.out.println("oredrs "+noOfCups);

		soda = soda +noOfCups;
		System.out.println("count "+soda );
	}

	
	public void getPepsi(Integer noOfCups) {

		pepsi = pepsi+noOfCups;
	}
	public void getCheese(Integer noOfCups) {

		cheese =cheese+noOfCups;
	}
	public void getPen(Integer noOfCups) {

		pen =pen +noOfCups;
	}

	public List<Drink> getDrinks() {

		List<Drink> drinks = new ArrayList<Drink>();

		drinks.add(new Drink("soda", soda, soda*20));
		drinks.add(new Drink("pepsi", pepsi, pepsi*80));
		drinks.add(new Drink("cheese", cheese,cheese*350));
		drinks.add(new Drink("pen", pen, pen*20));

		return drinks;

	}
	
	public List<Containers> getContainers(){
		
		List<Containers> conts=new ArrayList<Containers>();
		
		conts.add(new Containers(1, "soda", 2,1.98f));
		conts.add(new Containers(2, "pepsi", 2, 2.04f));
		conts.add(new Containers(3, "cheese", 8, 7.74f));
		conts.add(new Containers(4, "pen", 15, 14.44f));
		
		
		return conts;
	}

}
