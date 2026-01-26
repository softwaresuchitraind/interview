package proj;
/*
 * 	i/p- 0521 1500 7865 1476
 * 	o/p- print cardnumber is a primary card or not
 * 	Get the 12 and 13th digit from the given card number
 * either of the 12th and 13th digit are 0 then it is not a primary card
 * else it is a primary card.
 * 
 * if both 12th and 13th are zero then send like cardnumber is invalid.
 * 
 * */
public class M2
{
	public static void main(String[] args)
	{
		String input ="0521 1500 7865 1476";
		cardcheck(input);
	}
	public static void cardcheck(String input)
	{
		
		if(input.length()<13)
		{
			System.out.println("Card number is invalid (length issue)");
			return;
		}
		
		String str=input.replace("\\s+", "");
		char twenlve=str.charAt(11);
		char thirteen=str.charAt(12);
		
		if(twenlve=='0' && thirteen=='0')
		{
			System.out.println("Card is Invalid");
		}
		else if(twenlve=='0' || thirteen=='0')
		{
			System.out.println("Card is not a primary card");
		}
		else
		{
			System.out.println("Card is primary card");
		}
	}

}
