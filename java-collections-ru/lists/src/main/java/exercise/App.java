package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble( String letters, String text ) {

        List<String> listLetters = new ArrayList<>(Arrays.asList(letters.toLowerCase().split("")));
        List<String> listLetterWords = new ArrayList<>(Arrays.asList(text.toLowerCase().split("")));

        for( String letter : listLetterWords ){
            if( !listLetters.contains(letter) ){
                return false;
            }

            listLetters.remove( letter );
        }

        return true;
    }
}
//END
