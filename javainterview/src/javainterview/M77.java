package javainterview;

// Write a program to print only numbers from an alphanumeric char array using stream API in java 8
import java.util.Arrays;

public class M77
{
	public static void main(String[] args)
	{
		String input = "a1b2c3d4e5f6g7h8i9j0";

		int[] nums = input.chars().filter(Character::isDigit).map(Character::getNumericValue).toArray();

		System.out.println("Numbers only ::" + Arrays.toString(nums));

	}

}
