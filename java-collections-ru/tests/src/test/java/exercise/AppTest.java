package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();

        Assertions.assertEquals(App.take(numbers, 1), expected);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        Assertions.assertNotEquals(App.take(numbers, 3), expected);

        expected.add(1);
        expected.add(2);
        Assertions.assertEquals(App.take(numbers, 2), expected);

        Assertions.assertEquals(App.take(numbers, -1), new ArrayList<>());
        // END
    }
}
