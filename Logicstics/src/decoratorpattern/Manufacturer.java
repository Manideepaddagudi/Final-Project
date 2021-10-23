package decoratorpattern;


import java.util.ArrayList;

import statePattern.State;

public class Manufacturer extends AbstractClasses implements State{
  
	
	String manufactureName;
	ArrayList<Disributor> distributor;
	Disributor distributorObj;
	int manufacturerCost=0;
	
	
	
	
	public Disributor getDistributorObj() {
		return distributorObj;
	}


	public void setDistributorObj(Disributor distributorObj) {
		this.distributorObj = distributorObj;
	}


	public int getManufacturerCost() {
		return manufacturerCost;
	}


	public void setManufacturerCost(int manufacturerCost) {
		this.manufacturerCost = manufacturerCost;
	}



	
	
	public Manufacturer() {
		
	}


	public String getManufactureName() {
		return manufactureName;
	}


	public void setManufactureName(String manufactureName) {
		this.manufactureName = manufactureName;
	}


	public ArrayList<Disributor> getDistributor() {
		return distributor;
	}


	public void setDistributor(ArrayList<Disributor> distributor) {
		this.distributor = distributor;
	}


	@Override
	public String toString() {
		return "Manufacturer [manufactureName=" + manufactureName + ", distributor=" + distributor + "]";
	}


	@Override
	void status() {
		System.out.println("Manufacturer has confirmed the Order---" + getManufactureName());
		
		
	}


	@Override
	void cantakeOrder() {
	System.out.println("Manufacturer has taken order from distributor---" +distributorObj.getDistributorName());
	
	System.out.println("Manufacturer has aaccpted the order from DISTRIBUTOR with Product as---" 
	+distributorObj.getSupplierobj().getReatilerDetails().getProductDeatils().get(0).productName);
//	
		
	}


	@Override
	void candeliverOrder() {
		System.out.println("Manufacturer can take the order");
		
	}


	@Override
	void costforOrder() {
		int cost = (int) (distributorObj.getDistributorCost()-super.cost() );
		System.out.println("DISTRIBUTOR cost For the Order---"+cost +"$");
		setManufacturerCost(cost);
	}


	@Override
	void ProductDeatils() {
		
	}


	@Override
	void addproduct() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public
	void printobject() {
		
		   System.out.println("Order from Distributor to Manufacturer");
		   cantakeOrder();
		   costforOrder();
		   status();
		
		
	}


	@Override
	public void CustomerState() {
		
		
	}


	@Override
	public void logisticisState() {
		
		
	}


	@Override
	public void SupplierState() {
	
		
	}


	@Override
	public void DistributorSate() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void MnaufacturerState() {
		// TODO Auto-generated method stub
		
	}


	public void setObjects(Disributor distributor_) {
		
		distributorObj= distributor_;
		setDistributorObj(distributor_);
		setManufactureName("Apple Manufacturing Company");
		
		
		
	}



	
	
	
	
	
   
}
