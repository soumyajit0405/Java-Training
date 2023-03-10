package newfeatures.e2;

import java.util.*;
import java.util.stream.Collectors;


public class Stream1 {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		List<String> productPriceList = productsList.stream().filter(p -> p.price < 30000)// filtering data
				.map(p -> p.name) // fetching price
				.collect(Collectors.toList()); // collecting as list
		System.out.println(productPriceList); // displaying data
	}
}
