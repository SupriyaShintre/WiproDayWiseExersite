package com.wipro.stream;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Optional<Integer> number = Optional.of(100);
        number.ifPresent(n -> System.out.println("Value is present: " + n));
        Optional<Integer> emptyNumber = Optional.empty();
        int result = emptyNumber.orElse(50);
        System.out.println("Value from empty optional (with default): " + result);

	}

}
