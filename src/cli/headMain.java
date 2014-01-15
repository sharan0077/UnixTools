package cli;


import UnixTools.Head;
import FileSystem.FileSystem;

public class headMain {
    public static void main(String[] args) {
        Head head = new Head();
        FileSystem fs = new FileSystem();
        String text = "";
        String linesToBeDisplayed;
        int count = 10;
        try {
            if (args.length > 1 && args[1].startsWith("-"))
                count = Integer.parseInt(args[1].substring(1));
                text = fs.readFileContent(args[0]);
            linesToBeDisplayed =  head.getLines(text , count);
            System.out.println(linesToBeDisplayed);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
