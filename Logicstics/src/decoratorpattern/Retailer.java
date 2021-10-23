package decoratorpattern;
import java.util.ArrayList;

import iteratorPattern.ProductMenuItems;
import statePattern.State;

public class Retailer extends AbstractClasses implements State{
	
	
	String retailerName;
	Customer customer;
	ArrayList<ProductMenuItems> productDeatils = new ArrayList<>();
	int retailercost=0;
	
	

	public int getRetailercost() {
		return retailercost;
	}

	public void setRetailercost(int retailercost) {
		this.retailercost = retailercost;
	}

	public Retailer() {
		super();
	}

	public Retailer(String retailerName, Customer customer, ArrayList<ProductMenuItems> productDeatils) {
		this.retailerName=retailerName;
		this.customer = customer;
		this.productDeatils = productDeatils;
	}
	
	@Override
	public String toString() {
		return "Retailer [retailerName=" + retailerName + ", customer=" + customer + ", productDeatils="
				+ productDeatils + "]";
	}


	public String getRetailerName() {
		return retailerName;
	}


	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}


	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public ArrayList<ProductMenuItems> getProductDeatils() {
		return productDeatils;
	}
	public void setProductDeatils(ArrayList<ProductMenuItems> productDeatils) {
		this.productDeatils = productDeatils;
	}

	@Override
	void status() {
		System.out.println("Retatiler has confirmed the Order---" + getRetailerName());
		
	}

	@Override
	void cantakeOrder() {
	System.out.println("Reatiler has aaccpted the order from Customer---" + customer.name);
	System.out.println("Reatiler has aaccpted the order from Customer with Product as---" + productDeatils.get(0).getProductName());
		
	}

	@Override
	void candeliverOrder() {
		
		System.out.println("Reatiler also has Customer address---"+ customer.address);
	}

	@Override
	void costforOrder() {
		int cost = (int) ( productDeatils.get(0).getProductPrice() - super.cost());
		
		System.out.println("Reatiler Cost for the Product----" + cost +"$");
		setRetailercost(cost);
		
	}

	@Override
	void ProductDeatils() {
		
		System.out.println("Reatailer has product Details");
	}

	@Override
	void addproduct() {
		System.out.println("Retalier has received the");
		
	}
	
	public void setObjects(Customer customer_) {
		
		this.customer=customer_;
		this.productDeatils = this
				.customer.getProductName();
		
	
		
	}

	@Override
	public
	void printobject() {
	   setRetailerName("RETAILER INC");
	   System.out.println("Order from Customer to Retailer");
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
	
		
	}

	@Override
	public void MnaufacturerState() {
		
		
	}	
	
	
}
