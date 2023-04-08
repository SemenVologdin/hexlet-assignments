package exercise;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

// BEGIN
class ReversedSequence implements CharSequence {

    private String text;

    public ReversedSequence(String text) {
        List<String> listText = Arrays.asList(text.split(""));
        Collections.reverse(listText);

        this.text = String.join("", listText);
    }

    public ReversedSequence(String text, boolean isReversed) {
        if( !isReversed ){
            this.text = text;
        }else{
            List<String> listText = Arrays.asList(text.split(""));
            Collections.reverse(listText);

            this.text = String.join("", listText);
        }

    }

    @Override
    public int length() {
        return this.text.length();
    }

    @Override
    public char charAt(int index) {
        return this.text.toCharArray()[index];
    }

    @Override
    public boolean isEmpty() {
        return CharSequence.super.isEmpty();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new ReversedSequence(this.text.substring(start, end), false);
    }

    @Override
    public IntStream chars() {
        return CharSequence.super.chars();
    }

    @Override
    public IntStream codePoints() {
        return CharSequence.super.codePoints();
    }

    @Override
    public String toString() {
        return this.text;
    }
}
// END
