package iteratorPattern;

public class ProductMenuItems {
	
	public String productName;
	String productDescription;
	float productPrice;
	String sellerDetails;
	
	
	public ProductMenuItems(String productName, String productDescription, float productPrice,String sellerDetails) {
		
		this.productName= productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.sellerDetails= sellerDetails;
		
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	public String getSellerDetails() {
		return sellerDetails;
	}
	public void setSellerDetails(String sellerDetails) {
		this.sellerDetails = sellerDetails;
	}

	

}
