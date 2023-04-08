package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static void swapKeyValue( KeyValueStorage storage ) {
        List<String> keys = storage.toMap().keySet().stream().toList();
        List<String> values = storage.toMap().values().stream().toList();
        keys.forEach(storage::unset);

        for( int i = 0; i < values.size(); i++  ){
            storage.set(values.get(i), keys.get(i));
        }
    }
}
// END
