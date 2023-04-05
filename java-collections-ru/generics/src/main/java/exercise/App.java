package exercise;

import java.util.*;
import java.util.Map.Entry;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> filter){
        List<Map<String,String>> result = new ArrayList<>();

        OUTER:
        for( Map<String, String> book : books ){
            Set<String> bookKeys = book.keySet();
            for( String key : bookKeys ){

                if( Objects.isNull(filter.get(key)) || Objects.isNull(book.get(key)) ){
                    continue;
                }

                if( !book.get(key).equalsIgnoreCase(filter.get(key)) ){
                    continue OUTER;
                }
            }
            result.add(book);
        }

        return result;
    }
}
//END
