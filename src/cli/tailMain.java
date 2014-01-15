package cli;

import FileSystem.FileSystem;
import UnixTools.Tail;


public class tailMain {
    public static void main(String[] args) {
        Tail tail = new Tail();
        FileSystem fs = new FileSystem();
        String text = "";
        String linesToBeDisplayed;
        int count = 10;
        try {
            if (args.length > 1 && args[1].startsWith("-"))
                count = Integer.parseInt(args[1].substring(1));
            text = fs.readFileContent(args[0]);
            linesToBeDisplayed =  tail.getLines(text , count);
            System.out.println(linesToBeDisplayed);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
