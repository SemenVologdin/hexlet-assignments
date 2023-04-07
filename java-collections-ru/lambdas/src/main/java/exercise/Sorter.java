package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
class Sorter {
    public static List<String> takeOldestMans( List<Map<String, String>> mans ){
        return mans.stream()
                .filter(el->el.get("gender").equals("male"))
                .sorted(Comparator.comparing(o -> o.get("birthday")))
                .map(el->el.get("name"))
                .collect(Collectors.toList());
    }
}
// END
