package project1;

import java.util.*;
import java.util.stream.Collectors;
/*
 * I/P - 4, 2, 6, 4, 2, 4, 6, 5, 3
	O/P -4, 4, 4, 2, 2, 6, 6, 3, 5
 * */
public class CustomSort8 {
    public static void main(String[] args) {
        int[] inputArray = {4, 2, 6, 4, 2, 4, 6, 5, 3};
        int[] sortedArray = customSort(inputArray);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] customSort(int[] array) {
        // Create a frequency map to count occurrences of each element
        Map<Integer, Long> frequencyMap = Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        // Sort the array using the frequency map
        return Arrays.stream(array)
                .boxed()
                .sorted((a, b) -> {
                    int freqCompare = frequencyMap.get(b).compareTo(frequencyMap.get(a));
                    return freqCompare == 0 ? Integer.compare(a, b) : freqCompare;
                })
                .mapToInt(i -> i)
                .toArray();
    }
}
