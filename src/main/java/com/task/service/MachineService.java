package com.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.dao.MachineDao;
import com.task.model.Drink;

@Service
public class MachineService {
	
	@Autowired
	private MachineDao dao;
	
	

	public List<Drink> getDrinks() {
		// TODO Auto-generated method stub
		return dao.getDrinks();
	}

}
