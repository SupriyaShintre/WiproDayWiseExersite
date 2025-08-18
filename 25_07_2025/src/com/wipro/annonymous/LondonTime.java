package com.wipro.annonymous;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;

public class LondonTime {

    public static void main(String[] args) {
        Consumer<ZoneId> printCurrentTime = zone -> {
            ZonedDateTime time = ZonedDateTime.now(zone);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss z");
            System.out.println("Current time in " + zone + ": " + time.format(formatter));
        };

        printCurrentTime.accept(ZoneId.of("Europe/London"));
    }
}
