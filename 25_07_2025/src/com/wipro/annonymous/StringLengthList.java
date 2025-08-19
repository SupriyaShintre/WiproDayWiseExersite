package com.wipro.annonymous;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringLengthList {
	public static void main(String[] args) {
        List<String> input = Arrays.asList("Jayanta", "Amit", "Vasu");

        Function<List<String>, List<Integer>> getLengths = list -> {
            return list.stream()
                       .map(str -> str.length())
                       .collect(Collectors.toList());
        };

        System.out.println(getLengths.apply(input));  // Output: [7, 4, 4]
    }
}
