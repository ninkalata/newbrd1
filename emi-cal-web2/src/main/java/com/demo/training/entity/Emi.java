package com.demo.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "emi")
public class Emi {

	@Override
	public String toString() {
		return "Emi [no=" + no + ", loanamount=" + loanamount + ", rateofinterest=" + rateofinterest
				+ ", noofinstallments=" + noofinstallments + ", tenure=" + tenure + ", emi=" + emi + "]";
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public double getLoanamount() {
		return loanamount;
	}
	public void setLoanamount(double loanamount) {
		this.loanamount = loanamount;
	}
	public double getRateofinterest() {
		return rateofinterest;
	}
	public void setRateofinterest(double rateofinterest) {
		this.rateofinterest = rateofinterest;
	}
	public int getNoofinstallments() {
		return noofinstallments;
	}
	public void setNoofinstallments(int noofinstallments) {
		this.noofinstallments = noofinstallments;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getEmi() {
		return emi;
	}
	public void setEmi(double emi) {
		this.emi = emi;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "no")
	private int no;

	@Column(name = "loanamount")

	private double loanamount;

	@Column(name = "rateofinterest")

	private double rateofinterest;

	@Column(name = "noofinstallments")

	private int noofinstallments;

	@Column(name = "tenure")

	private int tenure;
	@Column(name = "emi")
	private double emi;
}
	