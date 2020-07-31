package com.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.task.dao.MachineDao;
import com.task.model.Containers;
import com.task.model.Drink;
import com.task.service.MachineService;

@Controller
public class MachineController {

	@Autowired
	private MachineService service;
	
	@Autowired
	private MachineDao dao;

	@RequestMapping("/home")
	// @ResponseBody
	public String test(ModelMap map) {

		map.addAttribute("soda", new Drink("soda", 1, 20));
		map.addAttribute("pepsi", new Drink("pepsi", 1, 80));
		map.addAttribute("cheese", new Drink("cheese", 1, 350));
		map.addAttribute("pen", new Drink("pen", 1, 20));
		
		

		return "home";
	}

	@RequestMapping(value = "/getTea", method = RequestMethod.POST)
	public String getTea(@ModelAttribute("tea") Drink soda, ModelMap map) {
		
		dao.getSoda(soda.getNoOfCups());
		map.addAttribute("soda", new Drink("soda", 1, 20));
		map.addAttribute("pepsi", new Drink("pepsi", 1, 80));
		map.addAttribute("cheese", new Drink("cheese", 1, 350));
		map.addAttribute("pen", new Drink("pen", 1, 20));
		
		map.addAttribute("msg", "Thank you for ordering ' "+soda.getNoOfCups()+" ' soda");

		return "home";
	}

	@RequestMapping(value = "/getBlackTea", method = RequestMethod.POST)
	public String getBlackTea(@ModelAttribute("blackTea") Drink pepsi, ModelMap map) {
		
		dao.getPepsi(pepsi.getNoOfCups());

		map.addAttribute("soda", new Drink("soda", 1, 20));
		map.addAttribute("pepsi", new Drink("pepsi", 1, 80));
		map.addAttribute("cheese", new Drink("cheese", 1, 350));
		map.addAttribute("pen", new Drink("pen", 1, 20));
		
		
		
		map.addAttribute("msg", "Thank you for ordering ' "+pepsi.getNoOfCups()+" ' pepsi");

		return "home";
	}

	@RequestMapping(value = "/getCoffee", method = RequestMethod.POST)
	public String getCoffee(@ModelAttribute("coffee") Drink cheese, ModelMap map) {
		
		dao.getCheese(cheese.getNoOfCups());
		
		map.addAttribute("soda", new Drink("soda", 1, 20));
		map.addAttribute("pepsi", new Drink("pepsi", 1, 80));
		map.addAttribute("cheese", new Drink("cheese", 1, 350));
		map.addAttribute("pen", new Drink("pen", 1, 20));
		
		map.addAttribute("msg", "Thank you for ordering ' "+cheese.getNoOfCups()+" ' cheese");

		return "home";
	}

	@RequestMapping(value = "/getBlackCoffee", method = RequestMethod.POST)
	public String getBlackCoffee(@ModelAttribute("blackCoffee") Drink pen, ModelMap map) {

		dao.getPen(pen.getNoOfCups());
		map.addAttribute("soda", new Drink("soda", 1, 20));
		map.addAttribute("pepsi", new Drink("pepsi", 1, 80));
		map.addAttribute("cheese", new Drink("cheese", 1, 350));
		map.addAttribute("pen", new Drink("pen", 1, 20));
		
		map.addAttribute("msg", "Thank you for ordering ' "+pen.getNoOfCups() +" ' pen");

		return "home";
	}

	@RequestMapping("/report")
	public String home(ModelMap map) {

		int totalNoOfCups = 0;
		float totalCost = 0;

		List<Drink> drinks = service.getDrinks();

		map.addAttribute("drinks", drinks);

		for (Drink d : drinks) {
			totalCost = totalCost + d.getCost();
			totalNoOfCups = totalNoOfCups + d.getNoOfCups();
		}
		map.addAttribute("noOfCups", totalNoOfCups);
		map.addAttribute("totalCost", totalCost);

		return "salesReport";
	}

	@RequestMapping("/containerstatus")
	public String showContainer(ModelMap map) {

		List<Containers> containers=dao.getContainers();
		
		map.addAttribute("conts", containers);
		
		
		return "containerStatus";
	}
	@RequestMapping("/stocklist")
	public String stocklist() {
		return "stocklist";
		
	}
	
	

}
