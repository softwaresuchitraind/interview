package javainterview;

import java.util.Arrays;
import java.util.List;

class Product
{
	private String productId;
	private Double productPrice;
	
	Product(String productId,Double productPrice)
	{
		this.productId=productId;
		this.productPrice=productPrice;
	}
	
	public Double getProductPrice()
	{
		return productPrice;
	}
}
class Order
{
	private String orderId;
	private List<Product> products;
	
	Order(String orderId,List<Product> products)
	{
		this.orderId =orderId;
		this.products=products;
	}
	public List<Product> getproducts()
	{
		return products;
	}
}
public class M23
{
	public static void main(String[] args)
	{
		Product p1 = new Product("P01",100.0);
		Product p2 = new Product("P02",300.0);
		Product p3 = new Product("P03",200.0);
		Product p4 = new Product("P04",500.0);
		
		List<Product> alproducts = Arrays.asList(p1,p2,p3,p4);
		
		Order o1 = new Order("O01", alproducts);
		double totalPrice=calculatePrice(o1);
		System.out.println(totalPrice);
	}

	private static double calculatePrice(Order o1)
	{
		double sum = o1.getproducts().stream().mapToDouble(Product::getProductPrice).sum();
		return sum;
	}
}
