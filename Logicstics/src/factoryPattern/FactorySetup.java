package factoryPattern;

import decoratorpattern.AbstractClasses;
import decoratorpattern.Customer;
import decoratorpattern.Disributor;
import decoratorpattern.Logistics;
import decoratorpattern.Manufacturer;
import decoratorpattern.Retailer;
import decoratorpattern.Supplier;

public class FactorySetup {
	
	

    public FactorySetup() {
		
	}

	public AbstractClasses createObjects(String type)
	{
			AbstractClasses abs =null ;
			
			if(type=="Supplier")
			{
				return new Supplier();
			}
			
			if(type=="Manufacturer")
			{
				return new Manufacturer();
			}
			
			if(type=="Retailer")
			{
				return new Retailer();
			}
			
			if(type=="Customer")
			{
				return new Customer();
			}
			
			if(type=="Logistics")
			{
				return new Logistics();
			}
			
			if(type=="Distributor")
			{
				return new Disributor();
			}
			
			return abs;
			
		
		
	}
	

}
