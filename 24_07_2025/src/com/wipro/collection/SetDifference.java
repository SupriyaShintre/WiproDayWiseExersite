package com.wipro.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDifference {
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(10, 20, 30, 40);
        Set<Integer> set2 = Set.of(30, 40, 50, 60);

        Set<Integer> diff = new HashSet<>(set1);
        diff.removeAll(set2);

        System.out.println(diff); 
    }
}
