package exercise;

import java.util.*;

// BEGIN
class App {
    public static Map<String, String> genDiff(Map<String, Object> map1, Map<String, Object> map2) {
        Map<String, String> result = new HashMap<>();

        Set<String> allKeys = new HashSet<>();
        allKeys.addAll(map1.keySet());
        allKeys.addAll(map2.keySet());

        for( String key : allKeys ){
            if( !map1.containsKey(key) ){
                result.put(key, "added");
                continue;
            }

            if( !map2.containsKey(key) ){
                result.put(key, "deleted");
                continue;
            }

            if( map1.get(key) == map2.get(key) ){
                result.put(key, "unchanged");
                continue;
            }

            result.put(key, "changed");
        }

        return result;
    }
}
//END
