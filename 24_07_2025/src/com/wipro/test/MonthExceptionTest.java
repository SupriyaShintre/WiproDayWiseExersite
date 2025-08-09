package com.wipro.test;

import com.wipro.exception.InvalidMonthException; // ✅ import your custom exception

public class MonthExceptionTest {
    public static void checkMonth(int month) throws InvalidMonthException {
        if (month < 1 || month > 12) {
            throw new InvalidMonthException("Invalid month: " + month + ". Month should be between 1 and 12.");
        } else {
            System.out.println("Valid month: " + month);
        }
    }

    public static void main(String[] args) {
        try {
            checkMonth(5);   // Valid
            checkMonth(15);  // Invalid
        } catch (InvalidMonthException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
