import java.util.ArrayList;
import java.util.List;

import decoratorpattern.AbstractClasses;
import decoratorpattern.Customer;
import decoratorpattern.Disributor;
import decoratorpattern.Logistics;
import decoratorpattern.Manufacturer;
import decoratorpattern.Retailer;
import decoratorpattern.Supplier;
import factoryPattern.FactorySetup;
import statePattern.State;



public class main {

	
	
	public static void main(String[] args) {
		
		
		List<State> state_lists = new ArrayList<State>();
		
		
		State state ;
		FactorySetup fac= new FactorySetup();
		
	
		System.out.println("---------Customer Information--------------");
	
		AbstractClasses  customer = fac.createObjects("Customer");
		Customer customer_ = (Customer) customer;
		customer_.printobject();
		System.out.println("---------Reatiler Information--------------");
		
		AbstractClasses  reatiler = fac.createObjects("Retailer");
		Retailer reatiler_ = (Retailer) reatiler;
		reatiler_.setObjects(customer_);
		reatiler_.printobject();
		
		
		System.out.println("---------Supplier Information--------------");
		
		AbstractClasses  supplier = fac.createObjects("Supplier");
		Supplier supplier_ = (Supplier) supplier;
		supplier_.setObjects(reatiler_);
		supplier_.printobject();
		
		
		System.out.println("---------Distributor Information--------------");
		
		AbstractClasses  distributor = fac.createObjects("Distributor");
		Disributor distributor_ = (Disributor) distributor;
		distributor_.setObjects(supplier_);
		distributor_.printobject();
		 
		
		System.out.println("---------Manufacturer Information--------------");
		
		AbstractClasses  manufacturor = fac.createObjects("Manufacturer");
		Manufacturer manufacturer_ = (Manufacturer) manufacturor;
		manufacturer_.setObjects(distributor_);
		manufacturer_.printobject();
		
		
		System.out.println("---------Logistics Information--------------");
		AbstractClasses  logistics = fac.createObjects("Logistics");
		Logistics logistics_ = (Logistics) logistics;
		
		
		logistics_.setObjects(manufacturer_,distributor_,supplier_,reatiler_,customer_);
		logistics_.printobject();
		
		
	}

}
