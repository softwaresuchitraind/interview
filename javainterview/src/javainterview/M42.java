package javainterview;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//Most repeted Character
public class M42 {
    public static void main(String[] args) {
        String input = "example string";
        
        Optional<Map.Entry<Character, Long>> mostRepeatedChar = input.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .max(Map.Entry.comparingByValue());

        /*
         * this is used in java 9
        mostRepeatedChar.ifPresentOrElse(
            entry -> System.out.println("Most Repeated Character: " + entry.getKey() + " with " + entry.getValue() + " occurrences"),
            () -> System.out.println("No repeating characters found")
        );
        */
        
        System.out.println("Most repeted char is "+mostRepeatedChar.get().getKey());
    }
}
