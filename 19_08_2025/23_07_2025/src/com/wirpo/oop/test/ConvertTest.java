package com.wirpo.oop.test;

import com.wipro.oop.Converter;

public class ConvertTest {
    public static void main(String[] args) {
    	Converter converter = new Converter();

        int result1 = converter.convert(5);
        System.out.println("convert(5) = " + result1);

        int result2 = converter.convert(5, 10);
        System.out.println("convert(5, 10) = " + result2);

        double result3 = converter.convert(7.5);
        System.out.println("convert(7.5) = " + result3);
    }
}
