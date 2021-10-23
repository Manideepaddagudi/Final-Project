package decoratorpattern;
import statePattern.State;

public class Logistics extends AbstractClasses implements State{
	
	String logicticsName;
	
	Retailer retailer;
	Supplier supplier;
	Manufacturer maufacturer;
	Disributor distributor;
	Customer customer;
	int logisticcost;
	
	
	
	public int getLogisticcost() {
		return logisticcost;
	}
	public void setLogisticcost(int logisticcost) {
		this.logisticcost = logisticcost;
	}
	public Logistics() {
		super();
	}
	public Logistics(String logicticsName, Retailer retailer, Supplier supplier, Manufacturer maufacturer,
			Customer customer) {
		super();
		this.logicticsName = logicticsName;
		this.retailer = retailer;
		this.supplier = supplier;
		this.maufacturer = maufacturer;
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Logistics [logicticsName=" + logicticsName + ", retailer=" + retailer + ", supplier=" + supplier
				+ ", maufacturer=" + maufacturer + ", customer=" + customer + "]";
	}
	@Override
	void status() {
		System.out.println("");
		
	}
	@Override
	void cantakeOrder() {
		System.out.println("Logistics can deliver to multiple Locations");
		
		
		
		
		
	}
	@Override
	void candeliverOrder() {
		
		
		System.out.println("Logiostics is deleivering the order to Customer details as below");
	
		
		System.out.println("Customer Name : "+customer.getName());
		System.out.println("Product Name : "+retailer.getCustomer().getProductName().get(0).productName);
		System.out.println("Customer Address : "+customer.getAddress());
		
	}
	@Override
	void costforOrder() {
		int cost=  maufacturer.getManufacturerCost()+super.cost();
		System.out.println("Logistics cost depends on the location");
		System.out.println("Logistics cost will be Manufacturer cost and Deleiver cost---"+ cost +"$");
		
		
	}
	@Override
	void ProductDeatils() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void addproduct() {
		
		
	}
	@Override
	public
	void printobject() {
		
		   System.out.println("Order from Distributor to Manufacturer");
		   cantakeOrder();
		   candeliverOrder();
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
		
		
	}
	@Override
	public void MnaufacturerState() {
		
		
	}
	
	
	
	
	public String getLogicticsName() {
		return logicticsName;
	}
	public void setLogicticsName(String logicticsName) {
		this.logicticsName = logicticsName;
	}
	public Retailer getRetailer() {
		return retailer;
	}
	public void setRetailer(Retailer retailer) {
		this.retailer = retailer;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public Manufacturer getMaufacturer() {
		return maufacturer;
	}
	public void setMaufacturer(Manufacturer maufacturer) {
		this.maufacturer = maufacturer;
	}
	public Disributor getDistributor() {
		return distributor;
	}
	public void setDistributor(Disributor distributor) {
		this.distributor = distributor;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void setObjects(Manufacturer manufacturer_, Disributor distributor_, Supplier supplier_, Retailer reatiler_,
			Customer customer_) {
		
		customer= customer_;
	    maufacturer = manufacturer_;
	    distributor= distributor_;
	    supplier= supplier_;
	    retailer= reatiler_;
	    
	    
	    setCustomer(customer);
	    setMaufacturer(maufacturer);
	    setDistributor(distributor);
	    setSupplier(supplier);
	    setRetailer(retailer);
		
	}
	
	

}
