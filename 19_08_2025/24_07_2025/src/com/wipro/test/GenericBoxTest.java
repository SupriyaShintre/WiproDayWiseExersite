package com.wipro.test;

import com.wipro.exception.Box;

public class GenericBoxTest {
    public static void main(String[] args) {
        Box<String> name = new Box<>();
        name.set("Hello");
        System.out.println(name.get());

        Box<Integer> no = new Box<>();
        no.set(473);
        System.out.println( no.get());

        Box<Double> doublex = new Box<>();
        doublex.set(8.67);
        System.out.println(doublex.get());
    }
}

