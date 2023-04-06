package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static int getCountOfFreeEmails( List<String> emails ){
        List<String> freeEmail = List.of("gmail.com", "yandex.ru", "hotmail.com");

        return (int)emails.stream()
                .map(el -> el.split("@")[1])
                .filter(freeEmail::contains)
                .count();
    }
}
// END
