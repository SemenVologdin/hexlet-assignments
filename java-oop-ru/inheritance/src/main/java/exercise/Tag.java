package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
class Tag {
    public String stringifyAttrs( Map<String, String> attrs ){
        StringBuilder sb = new StringBuilder();

        for( Map.Entry<String, String> el : attrs.entrySet() ){
            sb
                .append(" ")
                .append( el.getKey() )
                .append( "=" )
                .append( "\"" + el.getValue() + "\"" )
            ;
        }

        return sb.toString();
    }
}
// END
