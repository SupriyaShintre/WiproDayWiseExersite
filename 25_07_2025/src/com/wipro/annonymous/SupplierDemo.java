package com.wipro.annonymous;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        Supplier<String> tomorrowDay = () -> {
            LocalDate tomorrow = LocalDate.now().plusDays(1);
            return tomorrow.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        };

        System.out.println(tomorrowDay.get());
    }
}
