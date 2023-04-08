package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static List<String> buildApartmentsList( List<Home> homes, int count ){
        return homes.stream()
                .sorted((el1, el2)-> (int) (el1.getArea() - el2.getArea()))
                .map(Home::toString)
                .limit(count)
                .collect(Collectors.toList());
    }
}
// END
