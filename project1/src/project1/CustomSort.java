package project1;
import java.util.*;
/*
 * I/P - 4, 2, 6, 4, 2, 4, 6, 5, 3
O/P -4, 4, 4, 2, 2, 6, 6, 3, 5
 * */
public class CustomSort {
    public static void main(String[] args) {
        int[] inputArray = {4, 2, 6, 4, 2, 4, 6, 5, 3};
        int[] sortedArray = customSort(inputArray);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] customSort(int[] array) {
        // Create a frequency map to count occurrences of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Create a list from the array and sort it according to the custom comparator
        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }
        
        // Sort the list by frequency (descending) and by value (ascending) in case of a tie
        Collections.sort(list, (a, b) -> {
            int freqCompare = frequencyMap.get(b).compareTo(frequencyMap.get(a));
            return freqCompare == 0 ? Integer.compare(a, b) : freqCompare;
        });

        // Convert the list back to an array
        int[] result = new int[array.length];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
