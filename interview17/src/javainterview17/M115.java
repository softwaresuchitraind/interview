package javainterview17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 
 * 𝐒𝐜𝐞𝐧𝐚𝐫𝐢𝐨:
In a system with thousands of products, we need to:
Get only Electronics products.
Remove duplicates.
Sort by highest price first.
Convert product names to uppercase.
Finally, get the total count of Electronics products.
 * */
class Product
{
	String name;
	String category;
	double price;

	Product(String name, String category, double price)
	{
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public String getName()
	{
		return name;
	}

	public String getCategory()
	{
		return category;
	}

	public double getPrice()
	{
		return price;
	}
}

public class M115
{
	public static void main(String[] args)
	{
		List<Product> products = Arrays.asList(new Product("Laptop", "Electronics", 80000),
				new Product("Phone", "Electronics", 50000), new Product("TV", "Electronics", 60000),
				new Product("Shirt", "Clothing", 2000), new Product("Phone", "Electronics", 50000)// duplicate
		);

		List<String> result = products.stream().filter(p -> p.getCategory().equals("Electronics")).distinct()
				.sorted(Comparator.comparing(Product::getPrice).reversed()).map(p -> p.getName().toUpperCase())
				.collect(Collectors.toList());

		System.out.println("Filtered product " + result);
		
		long count = products.stream().filter(p -> p.getCategory().equals("Electronics")).count();
		System.out.println("Total electonics count  "+count);
		

	}
}
