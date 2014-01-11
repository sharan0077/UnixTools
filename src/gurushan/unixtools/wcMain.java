package gurushan.unixtools;

import java.io.*;



public class wcMain {
    public static void main(String[] args) {
        Wc wc = new Wc();
        FileSystem fs = new FileSystem();
        try {
            String text = fs.getFileContent(args[0]);
            int lineCount = wc.countLines(text);
            int wordCount = wc.countWords(text);
            int charCount = wc.countChar(text);

           System.out.println(lineCount+"\t"+wordCount+"\t"+charCount);
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }

}
