import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import decoratorpattern.AbstractClasses;
import decoratorpattern.Customer;
import decoratorpattern.Disributor;
import decoratorpattern.Logistics;
import decoratorpattern.Manufacturer;
import decoratorpattern.Retailer;
import decoratorpattern.Supplier;
import factoryPattern.FactorySetup;

public class CreatedObjectsTest {
	FactorySetup fac;
	AbstractClasses abstractObject;
	
	@BeforeEach
	public void Intialize() {
		fac = new FactorySetup();
		abstractObject =null;
		
	}
	
	@Test
	public void TestCreateObjectWithSupplier() {
		String supplier = "Supplier";
		abstractObject = fac.createObjects(supplier);
		assertTrue(abstractObject instanceof Supplier);
		
	}
	
	@Test
	public void TestCreateObjectWithManufacturer() {
		String manufacturer = "Manufacturer";
		abstractObject = fac.createObjects(manufacturer);
		assertTrue(abstractObject instanceof Manufacturer);
		
	}
	
	@Test
	public void TestCreateObjectWithRetailer() {
		String retailer = "Retailer";
		abstractObject = fac.createObjects(retailer);
		assertTrue(abstractObject instanceof Retailer);
		
	}
	
	@Test
	public void TestCreateObjectWithCustomer() {
		String customer = "Customer";
		abstractObject = fac.createObjects(customer);
		assertTrue(abstractObject instanceof Customer);
		
	}
	
	@Test
	public void TestCreateObjectWithLogistics() {
		String logistics = "Logistics";
		abstractObject = fac.createObjects(logistics);
		assertTrue(abstractObject instanceof Logistics);
		
	}
	
	@Test
	public void TestCreateObjectWithDistributor() {
		String distributor = "Distributor";
		abstractObject = fac.createObjects(distributor);
		assertTrue(abstractObject instanceof Disributor);
		
	}
}
