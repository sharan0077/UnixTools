package UnixTools;


public class wc {

    public int countLines(String text) {
        return text.split("\n").length;
    }

    public int countWords(String text) {
        return text.split("\\W").length;
    }

    public int countChar(String text) {
        return text.length();
    }

}
