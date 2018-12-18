package com.demo.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "calculator")

public class Calculator {

	@Override
	public String toString() {
		return "Calculator [paymentno=" + paymentno + ", NoofInstallments=" + NoofInstallments
				+ ", outstandingprincipal=" + outstandingprincipal + ", interestrate=" + interestrate
				+ ", principalcomponent=" + principalcomponent + ", emi=" + emi + "]";
	}

	public int getPaymentno() {
		return paymentno;
	}

	public void setPaymentno(int paymentno) {
		this.paymentno = paymentno;
	}

	public int getNoofInstallments() {
		return NoofInstallments;
	}

	public void setNoofInstallments(int noofInstallments) {
		NoofInstallments = noofInstallments;
	}

	public double getOutstandingprincipal() {
		return outstandingprincipal;
	}

	public void setOutstandingprincipal(double outstandingprincipal) {
		this.outstandingprincipal = outstandingprincipal;
	}

	public double getInterestrate() {
		return interestrate;
	}

	public void setInterestrate(double interestrate) {
		this.interestrate = interestrate;
	}

	public double getPrincipalcomponent() {
		return principalcomponent;
	}

	public void setPrincipalcomponent(double principalcomponent) {
		this.principalcomponent = principalcomponent;
	}

	public double getEmi() {
		return emi;
	}

	public void setEmi(double emi) {
		this.emi = emi;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="paymentno")
	private int paymentno;
	
	@Column(name = "noofinstallments")
	private int NoofInstallments;
	
	@Column(name = "outstandingprincipal")
	private double outstandingprincipal;
	
	@Column(name = "interestrate")
	private double interestrate;

	@Column(name = "principalcomponent")
	private double principalcomponent;
	
	@Column(name = "emi")
	private double emi;
}

	