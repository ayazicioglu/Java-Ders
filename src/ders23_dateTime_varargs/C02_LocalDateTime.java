package ders23_dateTime_varargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class C02_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime LDT=LocalDateTime.now(ZoneId.of("Turkey"));
        System.out.println(LDT);//2022-12-20T12:31:33.020374800

        LDT=LocalDateTime.now();
        System.out.println(LDT);//2022-12-20T12:31:33.032383

        System.out.println(LDT.getDayOfWeek());//TUESDAY
        System.out.println(LDT.withYear(2030));//2030-12-20T12:33:31.148932600

    }
}
