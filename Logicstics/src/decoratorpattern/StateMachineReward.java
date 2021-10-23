package decoratorpattern;
import java.util.ArrayList;
import java.util.List;

import statePattern.State;

public class StateMachineReward {
	
	State customer ;
	State manufacturer;
	State retailer;
	State supplier;
	State distributor;
	
	State logistics;
	State state;
	
	String name;
	List<State> state_lists = new ArrayList<State>();
	
	
	public StateMachineReward()
	{
		customer = new Customer(this);
//		manufacturer = new Manufacturer(this);
//		retailer = new Retailer(this);
//		supplier= new Supplier(this);
//		distributor= new Disributor(this);
		
		logistics = new Logistics();
		state= customer;
		this.state_lists.add(customer);
		 
	}


	public State getCustomer() {
		return customer;
	}


	public void setCustomer(State customer) {
		this.customer = customer;
	}


	public State getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(State manufacturer) {
		this.manufacturer = manufacturer;
	}


	public State getRetailer() {
		return retailer;
	}


	public void setRetailer(State retailer) {
		this.retailer = retailer;
	}


	public State getSupplier() {
		return supplier;
	}


	public void setSupplier(State supplier) {
		this.supplier = supplier;
	}


	public State getDistributor() {
		return distributor;
	}


	public void setDistributor(State distributor) {
		this.distributor = distributor;
	}


	public State getLogistics() {
		return logistics;
	}


	public void setLogistics(State logistics) {
		this.logistics = logistics;
	}


	public State getState() {
		return state;
	}


	public void setState(State state) {
		this.state = state;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<State> getState_lists() {
		return state_lists;
	}


	public void setState_lists(List<State> state_lists) {
		this.state_lists = state_lists;
	}
	

	
	
	
	

}
