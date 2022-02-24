package JDK8;

import java.time.*;

 class UptadeDemo_2a {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate date1 = LocalDate.of(2000, Month.JUNE, 06);
        Period gap = Period.between(date1, date);
        System.out.println("Gap is:: " + gap);
        LocalTime time = LocalTime.now();
        Duration hundredMinutes = Duration.ofMinutes(100);
        LocalTime time2 = time.plus(hundredMinutes);
        System.out.println("Time after 100 mins. " + time2);

    }
}

/**
 * Gap is:: P21Y8M18D 
 * Time after 100 mins. 12:53:43.117834600
 */