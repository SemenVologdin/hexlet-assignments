package exercise;

import java.util.Map;

// BEGIN
class SingleTag extends Tag {
    private String tag;
    private Map< String, String > attrs;

    public SingleTag(String tag, Map<String, String> attrs) {
        this.tag = tag;
        this.attrs = attrs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
                .append( "<" )
                .append(this.tag)
                .append( this.stringifyAttrs(this.attrs) )
                .append(">")
        ;

        return sb.toString();
    }
}
// END
