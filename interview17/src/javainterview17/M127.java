package javainterview17;

import java.util.List;

// Extract string that starts with number
public class M127
{
	public static void main(String[] args)
	{
		List<String> names = List.of("5java","python","3C","c++","1Ruby");
		
		List<String> filteredNames = names.stream()
			 .filter(name -> Character.isDigit(name.charAt(0)))
			 .toList();
		
		System.out.println(filteredNames);
	}
}
