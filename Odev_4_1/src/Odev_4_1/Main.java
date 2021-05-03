package Odev_4_1;

import java.rmi.RemoteException;
import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomeManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		BaseCustomerManager baseCustomerManager = new StarbucksCustomeManager(new MernisServiceAdapter());
		baseCustomerManager.save(new Customer(1,"Özkan","Demirel",new Date(1986,1,14),"12345678910"));
		
	}

}
