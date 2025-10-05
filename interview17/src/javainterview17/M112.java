package javainterview17;

import java.util.Arrays;
import java.util.List;
//Sumof square of even
public class M112
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Integer result = list.stream().filter(x->x%2==0).map(x->x*x).reduce(0,Integer::sum);
		System.out.println(result);
	}
}
