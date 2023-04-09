package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class PairedTag extends Tag  {
    private String tag;
    private Map<String, String> attrs;
    private String body;

    private List<Tag> childrens;

    public PairedTag(String tag, Map<String, String> attrs, String body, List<Tag> childrens) {
        this.tag = tag;
        this.attrs = attrs;
        this.body = body;
        this.childrens = childrens;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
                .append("<")
                .append(this.tag)
                .append(this.stringifyAttrs(this.attrs))
                .append(">")
                .append(this.body)
                .append(
                    this.childrens.stream()
                    .map(Tag::toString)
                    .collect(Collectors.joining())
                )
                .append("</")
                .append(this.tag)
                .append(">")
        ;

        return sb.toString();
    }
}
// END
