package proj;
/*
 *last five char
 * 	i/p--0521 1500 7865 1476
 * 	o/p--XXXX-XXXX-XXX-51476
 * 
 * */
public class M1
{
	public static void main(String[] args)
	{
		String str = "0521 1500 7865 1476";
		
		//remove spaces
		String number =str.replace(" ", "");
		
		//last five char
		String lastfive = number.substring(number.length()-5);
		
		//masked String
		System.out.println("XXXX-XXXX-XXX-"+lastfive);
	}
}
