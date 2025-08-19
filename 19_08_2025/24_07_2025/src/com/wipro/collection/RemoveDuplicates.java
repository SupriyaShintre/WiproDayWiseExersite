package com.wipro.collection;
import java.util.ArrayList;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList(
            "apple", "banana", "apple", "orange", "banana", "grape"));

        System.out.println("Original List: " + list);

        Set<String> set = new LinkedHashSet<>(list);

        List<String> noDuplicates = new ArrayList<>(set);

        System.out.println("List after removing duplicates: " + noDuplicates);
    }
}
