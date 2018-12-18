package com.demo.training.dao;

import java.util.List;

import com.demo.training.entity.Calculator;
import com.demo.training.entity.Emi;


public interface EmiDAO {

	
public	void saveEmi(double emi, Emi theEmi);

public List<Calculator> getCalculators();

public void saveCalculator(Calculator theCalculator);


	


	

}
