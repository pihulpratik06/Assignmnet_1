package JDK8;

import java.time.*;
import java.time.format.DateTimeFormatter;

 class UpdatesDemo_1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Today:: " + date);
        LocalTime time = LocalTime.now();
        System.out.println("Current Time:: " + time);
        LocalDateTime datetime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy ss:mm:HH");
        String formattedDateTime = datetime.format(format);
        System.out.println("Formatted:: " + formattedDateTime);
        ZonedDateTime currZone = ZonedDateTime.now();
        System.out.println("Current Zone:: " + currZone);
        ZoneId australia = ZoneId.of("Australia/Sydney");
        ZonedDateTime australiazone = currZone.withZoneSameInstant(australia);
        System.out.println("Australia Time Zone:: " + australiazone);
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd.MM.yyyy ss:mm:HH");
        String formattedDateTime1 = australiazone.format(format1);
        System.out.println("Australia Time & Date:: " + formattedDateTime1);

    }
}
/**
 * Today:: 2022-02-23 
 * Current Time:: 1:10:03.815393100 
 * Formatted:: 23.02.2022
 * 03:10:11 Current Zone:: 2022-02-23T 1:10:03
 * .848396200+05:30[Asia/Calcutta]
 * Australia Time Zone:: 2022-02-23
 * 16:40:03.848396200+11:00[Australia/Sydney]
 * Australia Time & Date:: 24.02.2022 03:40:16
 * 
 */