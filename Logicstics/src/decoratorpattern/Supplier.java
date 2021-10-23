package decoratorpattern;

public class Supplier extends AbstractClasses{
	
	String supplierName;
	Retailer reatilerDetails;
	int suppliercost=0;
	
	
	
	public int getSuppliercost() {
		return suppliercost;
	}


	public void setSuppliercost(int suppliercost) {
		this.suppliercost = suppliercost;
	}


	public Supplier() {
		
	}


	public Supplier(String supplierName, Retailer reatilerDetails) {
		this.supplierName = supplierName;
		this.reatilerDetails = reatilerDetails;
	}


	public String getSupplierName() {
		return supplierName;
	}


	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public Retailer getReatilerDetails() {
		return reatilerDetails;
	}

	public void setReatilerDetails(Retailer reatilerDetails) {
		this.reatilerDetails = reatilerDetails;
	}


	@Override
	public String toString() {
		return "Supplier [supplierName=" + supplierName + ", reatilerDetails=" + reatilerDetails + "]";
	}


	@Override
	void status() {
		
		
	System.out.println("Supplier Confirmed the Order--- "+getSupplierName());
		
	}


	@Override
	void cantakeOrder() {
		System.out.println("Supplier has taken the Order from Retailer--- "+reatilerDetails.getRetailerName());
		
		System.out.println("Supplier has aaccpted the order from Retailer with Product as---" + reatilerDetails.getProductDeatils().get(0).getProductName());
//		System.out.println("Supplier has aaccpted the order from Retailer with Product as---" + productDeatils.get(0).getProductName());
		
		
	}


	@Override
	void candeliverOrder() {
		System.out.println("Supplier has taken deleivered the Order--- ");
		
		
	}


	@Override
	void costforOrder() {
		int cost = (int) ( reatilerDetails.getRetailercost()- super.cost());
		System.out.println("Supplier cost For the Order---"+cost +"$");
		setSuppliercost(cost);
		
	}


	@Override
	void ProductDeatils() {
			System.out.println("Supplier also has Product Details");
		
	}


	@Override
	void addproduct() {
		System.out.println("Supplier has accpted Order Deatils");
		
	}


	@Override
	public
 void printobject() {
		 System.out.println("Order from Retailer to Supplier");
		   cantakeOrder();
		   costforOrder();
		   status();
	    
		
	}


	public void setObjects(Retailer retailer) {
		
		setSupplierName("Supplier Name -- INC SUPPLIER");
		
		setReatilerDetails(retailer);
		
	}
	
	
	

}
