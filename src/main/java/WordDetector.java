import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordDetector {

    //return true if the message contains the word
    public boolean messageContainTheWord(String msg,String word){
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(msg);
        if(matcher.find()) {
            return true;
        } else {
            return false;
        }
    }

    // returns true if the string does not have a number at the beginning
    public boolean isNoNumberAtBeginning(String s){
        return s.matches("^[^\\d].*");
    }

    // returns true if the string contains of 100 letters
    public boolean isTenLetters(String s){
        return s.matches("[a-zA-Z]{10}");
    }
}
