package com.demo.dao;

import java.util.List;


import com.demo.entity.Emi;

public interface EmiDAO {

	

	public void saveEmi(Emi theEmi);

	public Emi getEmi(int theno);

	public List<Emi> getemis();

	

	public float getemi(float loanAmount, float rateofInterest, float tenure, float NoofInstallments);

	

}
