package project1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * 
 * Array of characters
 
OutPut :
Map<Integer,Char>
key : index of character into aaray
value : character 
 * */
public class M4
{
	public static void main(String[] args)
	{
		List<String> asList = Arrays.asList("A","C","D");
		
		Map<Object, Object> collect = asList.stream().collect(Collectors.toMap(x->Function.identity(),x->x));
		
	}

}
