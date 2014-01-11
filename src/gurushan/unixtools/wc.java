package gurushan.unixtools;

/**
 * Created by gurushan on 1/9/14.
 */
public class Wc {
    public int countLines(String text){
        int lineCount = text.split("\n").length-1;
        return lineCount;
    }
    public int countWords(String text){
        int wordCount = text.split("\\W").length-1;
        return wordCount;
    }
    public int countChar(String text){
        return text.length();

    }
}
