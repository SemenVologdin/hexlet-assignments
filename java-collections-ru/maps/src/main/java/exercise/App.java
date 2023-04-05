package exercise;

import java.util.*;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount( String sentence ) {
        if( sentence.length() == 0 ){
            return new HashMap<>();
        }

        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>(Arrays.asList(sentence.split(" ")));

        for( String word : list ){
            if( !map.containsKey(word) ){
                map.put(word, 1);
                continue;
            }

            int count = map.get(word) + 1;
            map.put(word, count);
        }

        return map;
    }

    public static String toString( Map<String, Integer> map ) {
        String res = "{";

        if( map.size() == 0 ){
            return "{}";
        }
        for(String key : map.keySet() ){
            if( key.isEmpty() ){
                continue;
            }

            res += "\n  " + key + ": " + map.get(key);
        }
        if( res.length() > 1 ){
            return res + "\n}";
        }
        return res + "}";
    }
}
//END
