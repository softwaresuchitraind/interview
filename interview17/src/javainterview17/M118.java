package javainterview17;
//word count
public class M118
{
	public static void main(String[] args)
	{
		String review = "This product is really good and delivery was fast";
		int words = review.trim().split("\\s+").length;
		System.out.println("word count"+words);
	}
}
