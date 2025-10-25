package javainterview17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
𝐏𝐫𝐨𝐛𝐥𝐞𝐦: Analyze a product list using multiple Stream operations.
𝐒𝐜𝐞𝐧𝐚𝐫𝐢𝐨: In a system with thousands of products, we need to:
𝐅𝐢𝐧𝐝 out-of-stock products.
𝐒𝐨𝐫𝐭 them by price (high → low).
𝐆𝐫𝐨𝐮𝐩 products by category.
𝐅𝐢𝐧𝐝 the most expensive product.
𝐂𝐨𝐮𝐧𝐭 how many are cheap (< ₹500).
*/
class Item
{
	private String title;
	private double cost;
	private String category;
	private boolean inStock;

	Item(String title, double cost, String category, boolean inStock)
	{
		this.title = title;
		this.cost = cost;
		this.category = category;
		this.inStock = inStock;
	}

	public String getTitle()
	{
		return this.title;
	}

	public double getCost()
	{
		return this.cost;
	}

	public String getCategory()
	{
		return this.category;
	}

	public boolean getInStock()
	{
		return this.inStock;
	}

	@Override
	public String toString()
	{
		return title + ", cost=" + cost + ", category=" + category + ", inStock=" + inStock;
	}

}

public class M124
{
	public static void main(String[] args)
	{
		List<Item> items = Arrays.asList(new Item("Laptop", 55000, "Electronics", true),
				new Item("Phone", 20000, "Electronics", false), new Item("Shoes", 2500, "Fashion", true),
				new Item("T-Shirt", 800, "Fashion", false), new Item("Book", 400, "Education", true),
				new Item("Tablet", 30000, "Electronics", true), new Item("Pen", 50, "Education", true));

		// find out of stock products
		System.out.println("out of stock products :: ");

		items.stream().filter(i -> !(i.getInStock())).forEach(System.out::println);

		// sort product by price[high to low]
		System.out.println("Sort product by price :: ");
		items.stream().sorted(Comparator.comparingDouble(Item::getCost).reversed()).forEach(System.out::println);
		System.out.println();
		System.out.println("Group by Category");
		// group by category
		Map<String, List<Item>> groupedByCategory = items.stream().collect(Collectors.groupingBy(Item::getCategory));
		groupedByCategory.forEach((cat, list) -> System.out.println(cat + " " + list));

		System.out.println();

		// most expensive product
		System.out.println("\nMost expensive Product");
		items.stream().max(Comparator.comparingDouble(Item::getCost)).ifPresent(System.out::println);

		// count how many are cheap<500
		long cheapproducts = items.stream().filter(x -> x.getCost() < 500).count();

		System.out.println("products with price less than 500 " + cheapproducts);

	}
}
