package com.demo.service;

import java.util.List;


import com.demo.entity.Emi;

public interface EmiService {

	public void saveEmi(Emi theEmi);

	public Emi getEmi(int theno);

	public List<Emi> getemis();

public float getemi(float loanAmount, float rateofInterest, float tenure, float NoofInstallments);

public 	void repaymentSchedule(float emi, float loanAmount, float rateofInterest, float tenure, float NoofInstallments);

public void particularemi(float emi, float loanAmount, float rateofInterest, float tenure, float NoofInstallments);

	

}


