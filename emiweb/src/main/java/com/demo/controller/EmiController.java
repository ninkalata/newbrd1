package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.entity.Emi;
import com.demo.entity.Emi;
import com.demo.service.EmiService;


@Controller
@RequestMapping("/emi")
public class EmiController {
	@Autowired
	private EmiService emiService;
	@GetMapping("/detail") 
	public String detailEmi(Model theModel) {
		Emi theEmi = new Emi();
		

		theModel.addAttribute("emi", theEmi);

		
		return "emicalculator";
		
	}
	@RequestMapping

	(value="/calculator",method=RequestMethod.POST)
	public String calculator(Model theModel,HttpServletRequest request)
	{ String loanAmount=request.getParameter("loanAmount");
	String rateofInterest=request.getParameter("rateofInterest");
	String tenure=request.getParameter("tenure");
	String NoofInstallments=request.getParameter("NoofInstallments");
	theModel.addAttribute(loanAmount, loanAmount);
	theModel.addAttribute(rateofInterest,rateofInterest);
	theModel.addAttribute(tenure,tenure);
	theModel.addAttribute(NoofInstallments,NoofInstallments);
		return null;
		
	}
	
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		theModel.addAttribute("emi", new Emi());
		// get customers from the service
		List<Emi> theEmis = emiService.getemis();

		// add the customers to the model
		theModel.addAttribute("emis", theEmis);

		return "list";
	}
	@GetMapping("/showFormForAdd")

	public String showFormForAdd(Model theModel) {
		
		// create model 
		Emi theEmi = new Emi();
	

		theModel.addAttribute("emi", theEmi);

		return "customer-form";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Emi theEmi) {

		// save the customer using our service
		emiService.saveEmi(theEmi);

		return "redirect:/customer/list";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerCode") int theno, Model theModel) {

		// get the customer from our service
		Emi theEmi = emiService.getEmi(theno);

		// set customer as a model attribute to pre-populate the form
		theModel.addAttribute("emi", theEmi);

		// send over to form
		return "customer-form";
	}
	@GetMapping("/emi")
	public String  getemi(@RequestParam("loanAmount") float loanAmount, @RequestParam("rateofInterest")float rateofInterest, @RequestParam("tenure") float tenure, @RequestParam("noofInstallment")float NoofInstallments,Model theModel)
	{   
		float emi = emiService.getemi(loanAmount,rateofInterest,tenure,NoofInstallments);
		theModel.addAttribute("emi", emi);
		return "emi";
	}
}
			
//	@GetMapping("/emi")
//	 public void repaymentSchedule(@RequestParam("emi")float emi,@RequestParam("loanAmount") float loanAmount,  @RequestParam("rateofInterest")float rateofInterest, @RequestParam("tenure") float tenure,  @RequestParam("noofIntallment")float NoofInstallments) {
//		{ 
//			
//		
//	//.repaymentSchedule(emi, loanAmount, rateofInterest, tenure, NoofInstallments);
//}




