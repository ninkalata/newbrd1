package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.demo.dao.EmiDAO;

import com.demo.entity.Emi;

@Service
public class EmiServiceImpl implements EmiService {
	// need to inject customer dao
	@Autowired
	private EmiDAO emiDAO;
	
	

	@Override
	@Transactional
	public List<Emi> getemis() {

		return emiDAO.getemis();
	}

	@Override
	@Transactional
	public void saveEmi(Emi theEmi) {

		emiDAO.saveEmi(theEmi);
	}

	@Override
	@Transactional
	public Emi getEmi(int theno) {

		return emiDAO.getEmi(theno);
	}
	@Override
	@Transactional
	public float getemi(float loanAmount, float rateofInterest, float tenure, float NoofInstallments) {
		rateofInterest = rateofInterest / 100;
		float emiNumerator = loanAmount * rateofInterest / NoofInstallments;
		float emidenominator1 = (float) Math.pow((1 + ((rateofInterest / NoofInstallments))), tenure);
		float emidenominator2 = 1 / emidenominator1;
		float emi = (float) Math.round((emiNumerator / (1 - emidenominator2)) * 100 / 100);
		return emi;
		
	}
	@Override
	@Transactional
	// calculates The  Schedule for the entire loan period
		 public void repaymentSchedule(float emi, float loanAmount, float rateofInterest, float tenure, float NoofInstallments) {
			// Loops for each installment.
		    int j;
			float outstandingPrincipal[] = new float[100];
			float principalComponent[] = new float[100];
			float interestRate[] = new float[100];
			outstandingPrincipal[1] = loanAmount;
			for (j = 1; j <= NoofInstallments; j++) {
				interestRate[j] = (outstandingPrincipal[j] * (rateofInterest / (NoofInstallments * 100)));
				principalComponent[j] = emi - interestRate[j];
				outstandingPrincipal[j + 1] = outstandingPrincipal[j] - principalComponent[j];
				
			}
	}

	@Override
	 public void particularemi(float emi, float loanAmount, float rateofInterest, float tenure, float NoofInstallments) {

	
	
	

	
	
}
