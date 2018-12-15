package com.nature.model;

public class EmiCalculator
{
	

private float loanAmount;
private float rateofInterest;
private float tenure;
private float NoofInstallments;

public float getEMI(float loanAmount, float rateofInterest, float tenure, float NoofInstallments) {
	rateofInterest = rateofInterest / 100;
	float emiNumerator = loanAmount * rateofInterest / NoofInstallments;
	float emidenominator1 = (float) Math.pow((1 + ((rateofInterest / NoofInstallments))), tenure);
	float emidenominator2 = 1 / emidenominator1;
	float emi = (float) Math.round((emiNumerator / (1 - emidenominator2)) * 100 / 100);
	return emi;
}
	
public void repaymentSchedule(float emi, float loanAmount, float rateofInterest, float tenure, float NoofInstallments) {
	// Loops for each installment.
	// outstanding principle should be change each time.
	System.out.println("******The Repayment Schedule for the entire loan period************");
	int j;
	float outstandingPrincipal[] = new float[100];
	float principalComponent[] = new float[100];
	float interestRate[] = new float[100];
	outstandingPrincipal[1] = loanAmount;
	//System.out.println("#.no\tOutstandingPrinciple\tInterest\t" + "Principal\t" + "EMI");
	for (j = 1; j <= NoofInstallments; j++) {
		interestRate[j] = (outstandingPrincipal[j] * (rateofInterest / (NoofInstallments * 100)));
		principalComponent[j] = emi - interestRate[j];
		outstandingPrincipal[j + 1] = outstandingPrincipal[j] - principalComponent[j];
//		System.out.println(j + "\t" + Math.round(outstandingPrincipal[j] * 100) / 100 + "\t\t\t"
//				+ Math.round(interestRate[j] * 100) / 100 + "\t\t" + Math.round(principalComponent[j] * 100) / 100
//				+ "\t\t" + Math.round(emi * 100) / 100);
	}
}

public float getLoanAmount() {
	return loanAmount;
}

public void setLoanAmount(float loanAmount) {
	this.loanAmount = loanAmount;
}

public float getRateofInterest() {
	return rateofInterest;
}

public void setRateofInterest(float rateofInterest) {
	this.rateofInterest = rateofInterest;
}

public float getTenure() {
	return tenure;
}

public void setTenure(float tenure) {
	this.tenure = tenure;
}

public float getNoofInstallments() {
	return NoofInstallments;
}

public void setNoofInstallments(float NoofInstallments) {
	this.NoofInstallments = NoofInstallments;
}
}
