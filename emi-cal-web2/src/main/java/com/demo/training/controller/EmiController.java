package com.demo.training.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.training.entity.Calculator;
import com.demo.training.entity.Emi;
import com.demo.training.service.EmiService;

import java.util.List;


@Controller
@RequestMapping("/list")
public class EmiController{
	@Autowired
	private EmiService emiService;
	
	
	@GetMapping("/Emi")
	public String getEmi(Model theModel ) {
		Emi theEmi = new Emi();
		// add the emi to the model
		theModel.addAttribute("emi", theEmi);
		return "emi-form";	
 }
    @PostMapping("/saveEmi")
   public String calculateEmi(@RequestParam("loanamount") double loanamount,@RequestParam("rateofinterest") double rateofinterest,@RequestParam("noofinstallments") int noofinstalments,@RequestParam("tenure") int tenure,Emi theEmi,Model theModel){
    // create model 
	double emiResult = emiService.Calculator(loanamount, rateofinterest,noofinstalments,tenure,theEmi);
 	theModel.addAttribute("emi", theEmi.getEmi());
 	//emiService.getrepay(loanAmount, rateofInterest,NoofInstalments,tenure,theEmi);
    return "emi-form";
	}
	
	@PostMapping("/repaypaymentschedule")
	public String schedule(Model theModel)
	{
		Emi theEmi = new Emi();
		emiService.ReypaymentSchedule(theEmi);
		// get calculator from the service
		List<Calculator> theCalculators = emiService.getCalculators();
		// add the calculator to the model
		theModel.addAttribute("calculators", theCalculators);
       return "list-emi";
		
	}
	
	

}
