package homework_21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //1. Вывести текущую дату в формате (пример формата: 1 апреля 2023). На выходе дата должна быть класса String
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", new Locale("ru"));
        String todayStr = today.format(dateTimeFormatter);
        System.out.println(todayStr);

        //2. Вывести текущую дату в формате (пример формата: 1 апреля 2023, 10:59:20 PM). На выходе дата должна быть класса String
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm:ss a", new Locale("ru"));
        String todayStr1 = today.format(dateTimeFormatter1);
        System.out.println(todayStr1);

        //3. Перевести String (2023-03-19 : 10:12:24 AM) в формат LocalDateTime по умолчанию:2024-12-15T14:30:45.123456789
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd : hh:mm:ss a", Locale.ENGLISH);
        LocalDateTime date = LocalDateTime.parse("2023-03-19 : 10:12:24 AM", dateTimeFormatter2);
        System.out.println(date);

        //4. Перевести String (пн 20.03.23 г. время: 15:07:28  ) в формат LocalDateTime по умолчанию:2024-12-15T14:30:45.123456789
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("EE dd.MM.yy г. время: HH:mm:ss", new Locale("ru"));
        LocalDateTime date2 = LocalDateTime.parse("пн 20.03.23 г. время: 15:07:28", dateTimeFormatter3);
        System.out.println(date2);

        //5. *Вывести текущую дату в формате (пример формата: понедельник 20 марта 2023 время: 11.54.06 PM). На выходе дата должна быть класса String
        DateTimeFormatter dateTimeFormatter4 = new DateTimeFormatterBuilder()
                .appendPattern("EEEE d MMMM yyyy 'время: '")
                .appendValue(java.time.temporal.ChronoField.HOUR_OF_AMPM, 2)
                .appendLiteral('.')
                .appendValue(java.time.temporal.ChronoField.MINUTE_OF_HOUR, 2)
                .appendLiteral('.')
                .appendValue(java.time.temporal.ChronoField.SECOND_OF_MINUTE, 2)
                .appendPattern(" a")
                .toFormatter(new Locale("ru"));

        String date3 = today.format(dateTimeFormatter4);
        System.out.println(date3);

    }
}
