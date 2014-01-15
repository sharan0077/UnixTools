package cli;

import FileSystem.FileSystem;
import UnixTools.unique;

/**
 * Created by gurushan on 1/15/14.
 */
public class uniqueMain {
    public static void main(String[] args) {
        FileSystem fs = new FileSystem();
        unique unq = new unique();
        String linesToBeDisplayed;
        try{
            String text = fs.readFileContent(args[0]);
            linesToBeDisplayed = unq.getUniqueLines(text);
            System.out.println(linesToBeDisplayed);
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
}
