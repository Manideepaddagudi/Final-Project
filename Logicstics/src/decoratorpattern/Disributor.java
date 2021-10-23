package decoratorpattern;
import java.util.ArrayList;

import statePattern.State;
 
public class Disributor extends AbstractClasses implements State {
	
	String distributorName;
	Supplier supplierobj;
	ArrayList<Supplier> supplier;
	int distributorCost;
	

	
	
	
	public Supplier getSupplierobj() {
		return supplierobj;
	}
	public void setSupplierobj(Supplier supplierobj) {
		this.supplierobj = supplierobj;
	}
	public int getDistributorCost() {
		return distributorCost;
	}
	public void setDistributorCost(int distributorCost) {
		this.distributorCost = distributorCost;
	}
	public Disributor() {
		super();
	}
	@Override
	public String toString() {
		return "Disributor [distributorName=" + distributorName + ", supplier=" + supplier + "]";
	}
	public Disributor(String distributorName, ArrayList<Supplier> supplier) {
		super();
		this.distributorName = distributorName;
		this.supplier = supplier;
	}
	public String getDistributorName() {
		return distributorName;
	}
	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}
	public ArrayList<Supplier> getSupplier() {
		return supplier;
	}
	public void setSupplier(ArrayList<Supplier> supplier) {
		this.supplier = supplier;
	}
	@Override
	void status() {
		
		System.out.println("DISTRIBUTOR has confirmed the Order---" + getDistributorName());
		
	
		
	}
	@Override
	void cantakeOrder() {
		System.out.println("DISTRIBUTOR has taken the Order from Supplier--- "+supplierobj.getSupplierName());
		
		
		 System.out.println("DISTRIBUTOR has accpeted the order from Supplier with Product as---"
			       +supplierobj.getReatilerDetails().getProductDeatils().get(0).productName );
		
		
//        System.out.println("DISTRIBUTOR has accpeted the order from Retailer with Product as---"
//        + supplier.get(0).getReatilerDetails().getProductDeatils().get(0).getProductName() );
//		
		
	}
	@Override
	void candeliverOrder() {
		
		
	}
	@Override
	void costforOrder() {
		
		int cost = (int) (supplierobj.getSuppliercost()-super.cost() );
		System.out.println("DISTRIBUTOR cost For the Order---"+cost +"$");
		setDistributorCost(cost);
		
		
	}
	@Override
	void ProductDeatils() {
		
		
	}
	
	@Override
	void addproduct() {
		
		
	}
	@Override
	public
	void printobject() {
		
		 System.out.println("Distributor from Supplier to Distributor");
		  cantakeOrder();
		   costforOrder();
		   status();
		
		
		
	}
	public void setObjects(Supplier supplier_) {
		supplierobj = supplier_;
	    setSupplierobj(supplier_);
		setDistributorName("DISTRIBUTOR INC");
		setSupplier(supplier);
		
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
	
		
	}
	@Override
	public void MnaufacturerState() {
	
		
	}
	
	




	
	
	
	
  
}
