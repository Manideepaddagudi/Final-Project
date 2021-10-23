package decoratorpattern;



import java.util.ArrayList;

import iteratorPattern.ProductMenuItems;
import iteratorPattern.ProductMenuIterator;
import statePattern.State;

public class Customer extends AbstractClasses implements State{
	
	StateMachineReward machine;
	String name;
	String address;
	ArrayList<ProductMenuItems> productName;
	
	ArrayList<ProductMenuItems> pro = new ArrayList<ProductMenuItems>();
	State customer;
	
	ProductMenuItems[] menulist = new ProductMenuItems[50];
	ProductMenuIterator iterator = new ProductMenuIterator(menulist);
	private int numberofItems=0;
	
	
	public Customer(StateMachineReward stateMachineReward) {
		machine= stateMachineReward;
		
	}
	public Customer(String name, String address, ArrayList<ProductMenuItems> productName) {
		super();
		this.name = name;
		this.address = address;
		this.productName = productName;
	}
	
	
	
	public Customer() {
		
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", productName= +printproductname()]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public ArrayList<ProductMenuItems> getProductName() {
		return productName;
	}
	public void setProductName(ArrayList<ProductMenuItems> productName) {
		this.productName = productName;
	}
	
	
	public void printproductname()
	{
	
		ProductMenuIterator iterator = new ProductMenuIterator(menulist);
		while(iterator.hasnext())
		{
			ProductMenuItems menus= (ProductMenuItems) iterator.next();
			
			System.out.println("----------------");
			System.out.println(menus.getProductName() +"---"+ menus.getProductDescription() +"---"+ menus.getProductPrice()+"---"+ menus.getSellerDetails());
			System.out.println("----------------");
		}
		
	}

	@Override
	public void CustomerState() {
	     
		System.out.println("Current Customer State Machine - ");
		machine.setCustomer(machine.getCustomer());
		
		
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
	
	
	@Override
	void status() {
		System.out.println("Customer Order Confirmed");
	}
	@Override
	void cantakeOrder() {
		menulist[numberofItems]= new ProductMenuItems(getName(), "Phone", 3000, "Apple Inc");
		numberofItems = numberofItems+1;
		System.out.println("Customer has placed an order");
	
	}
	@Override
	void candeliverOrder() {
		System.out.println("Customer shipping address---"+getAddress());
		
	}
	@Override
	void costforOrder() {
		int cost = (int) (pro.get(0).getProductPrice() + super.cost());
		System.out.println("Product Cost for the order-- "+cost+"$");
	
	}
	@Override
	void ProductDeatils() {
		System.out.println("Customer Product Details");
		printproductname();
	}
	@Override
	void addproduct() {
		pro.add(new ProductMenuItems("Iphone", "Phone", 3000, "Apple Inc"));
		setName("Mani");
		setAddress("Address : USA");
		setProductName(pro);
		
	}
	@Override
	public void printobject() {
		addproduct();
		cantakeOrder();
		costforOrder();
		ProductDeatils();
		candeliverOrder();
		status();
	
		
	}
	
	
	
	

}
