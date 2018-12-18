package com.demo.training.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.demo.training.dao.EmiDAO;
import com.demo.training.entity.Calculator;
import com.demo.training.entity.Emi;

@Service
public class EmiServiceImpl implements EmiService{
	
    @Autowired
	private EmiDAO emiDAO;
    
//    @Override
//	@Transactional
//	public void calculateEmi(Emi theEmi) {
//		theEmi.setEmi(Calculator(loanAmount, rateofInterest, NoofInstalments, tenure, theEmi));
//		emiDAO.saveEmi(theEmi);
//	}
	
	@Override
	@Transactional
	public double Calculator(  double loanamount, double rateofinterest,int noofinstalments,int tenure,Emi theEmi)
	{
	
		
		rateofinterest = rateofinterest / 100;
		double emiNumerator = loanamount * rateofinterest / noofinstalments;
		double emidenominator1 = (double) Math.pow((1 + ((rateofinterest / noofinstalments))), tenure);
		double emidenominator2 = 1 / emidenominator1;
		double emi = (double) Math.round((emiNumerator / (1 - emidenominator2)) * 100 / 100);
		emiDAO.saveEmi(emi,theEmi);
		return emi;
		
		
	}
	public void ReypaymentSchedule(Emi theEmi)
	{
		
		double loanamount = theEmi.getLoanamount();
		double rateofinterest = theEmi.getRateofinterest();
		rateofinterest = rateofinterest / 100;
		int noofinstallments =theEmi.getNoofinstallments();
		int tenure =theEmi.getTenure();
		double emi=Calculator(loanamount,rateofinterest,noofinstallments,tenure,theEmi);
		theEmi.setEmi(emi);
		int j;
	
		double outstandingprincipal[] = new double[100];
		double  principalcomponent[] = new double[100];
		double interestrate[] = new double[100];
		outstandingprincipal[1] = (double) loanamount;
	
		for (j = 1; j <= noofinstallments; j++) {
			interestrate[j] = (double) (outstandingprincipal[j] * (rateofinterest / (noofinstallments * 100)));
			principalcomponent[j] = (double) (emi - interestrate[j]);
			outstandingprincipal[j + 1] = outstandingprincipal[j] - principalcomponent[j];
			System.out.println(j + "\t" + Math.round(outstandingprincipal[j] * 100) / 100 + "\t\t\t"
					+ Math.round(interestrate[j] * 100) / 100 + "\t\t" + Math.round(principalcomponent[j] * 100) / 100
					+ "\t\t" + Math.round(emi * 100) / 100);
		}
	}
	@Override
	@Transactional
	public List<Calculator> getCalculators() {

		return emiDAO.getCalculators();
	}
}
