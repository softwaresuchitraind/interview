package com.sukla.int123;
import java.util.*;
import java.util.stream.*;

public class SortMapByValueDescending {
    public static void main(String[] args) {
        // Example map
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 30);
        map.put("C", 20);

        // Sort the map by value in descending order
        Map<String, Integer> sortedMap = map.entrySet()
            .stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1, // If there are duplicate keys
                LinkedHashMap::new // Use LinkedHashMap to preserve the order
            ));

        // Print the sorted map
        sortedMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
