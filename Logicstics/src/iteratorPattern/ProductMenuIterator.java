package iteratorPattern;
import java.util.Arrays;

public class ProductMenuIterator implements OwnIterator {
	ProductMenuItems [] items;
	
	int position = 0;
	
	public  ProductMenuIterator(ProductMenuItems [] items) {
		this.items = items;
	}
	
	@Override
	public boolean hasnext() {
		if(position >= items.length || items[position]== null ) {
			return false;
		}else{
			return true;
		}
		
	}
	@Override
	public Object next() {
		ProductMenuItems menu  = items[position];
		position = position +1;
		return menu;
	}

	@Override
	public String toString() {
		return "ProductMenuIterator [items=" + Arrays.toString(items) + ", position=" + position + "]";
	}

	
	
}
