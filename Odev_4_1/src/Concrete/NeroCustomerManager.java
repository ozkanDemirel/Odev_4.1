package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	

	private CustomerCheckService customerCheckService;
	
	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
			
			System.out.println("Welcome to Nero : " + customer.getFirstName()+" "+customer.getLastName());
		}
		else {
			System.out.println("Not a valid Person");
			//throw new Exception("Not a valid Person");
		}

	}

}
