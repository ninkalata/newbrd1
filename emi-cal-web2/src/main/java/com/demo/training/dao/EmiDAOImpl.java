package com.demo.training.dao;

import java.util.List;
import org.hibernate.query.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.demo.training.entity.Calculator;
import com.demo.training.entity.Emi;

@Repository
public class EmiDAOImpl implements EmiDAO{
	@Autowired
	private SessionFactory sessionFactory;	
	@Override
	public void saveEmi(double emi,Emi theEmi) {
		// create session
		System.out.println(emi);
    Session currentSession = sessionFactory.getCurrentSession();
    
    //theEmi.setEmi(emi);
   currentSession.saveOrUpdate(theEmi);
}
	@Override

	public List<Calculator> getCalculators() {
		// create session
		Session currentSession = sessionFactory.getCurrentSession();
		// query
		Query<Calculator> theQuery = currentSession.createQuery("from calculator ORDER BY paymentNo ", Calculator.class);
		// execute query 
		List<Calculator> calculators = theQuery.getResultList();
		// return the results
		return calculators;
	}
	@Override
	public void saveCalculator(Calculator theCalculator) {
// get current session
Session currentSession = sessionFactory.getCurrentSession();
//save or Update
currentSession.saveOrUpdate(theCalculator);
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
