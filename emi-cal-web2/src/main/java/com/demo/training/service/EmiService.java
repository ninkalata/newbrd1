package com.demo.training.service;

import java.util.List;

import com.demo.training.entity.Calculator;
import com.demo.training.entity.Emi;


public interface EmiService {


	double Calculator(double loanAmount, double rateofInterest, int NoofInstalments, int tenure, Emi theEmi);

	public void ReypaymentSchedule(Emi theEmi);

	public List<com.demo.training.entity.Calculator> getCalculators();


	
	
}
