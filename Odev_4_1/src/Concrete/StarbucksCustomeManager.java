package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class StarbucksCustomeManager extends BaseCustomerManager  {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomeManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
			
			System.out.println("Welcome to Starbucks : " + customer.getFirstName()+" "+customer.getLastName());
		}
		else {
			System.out.println("Not a valid Person");
			//throw new Exception("Not a valid Person");
		}
		
	}

	

	

}
