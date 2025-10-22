package javainterview17;

import java.util.Arrays;
import java.util.Comparator;

//longest words
public class M121
{
	public static void main(String[] args)
	{
		String sentence = "java stream make coding powerful and consise";
		String longestWord = Arrays.stream(sentence.split(" ")).max(Comparator.comparingInt(String::length)).orElse(" ");
		System.out.println("Longest Word    " +longestWord);
	}
}
