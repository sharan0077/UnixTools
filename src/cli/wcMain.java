package cli;

import UnixTools.wc;
import FileSystem.FileSystem;
public class wcMain {
    public static void main(String[] args) {
        wc Wc = new wc();
        FileSystem fs = new FileSystem();
        try {
            String text = fs.readFileContent(args[0]);
            int lineCount = Wc.countLines(text);
            int wordCount = Wc.countWords(text);
            int charCount = Wc.countChar(text);

            System.out.println(lineCount+"\t"+wordCount+"\t"+charCount);
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}
