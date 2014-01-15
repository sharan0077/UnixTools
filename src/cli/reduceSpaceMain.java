package cli;

import FileSystem.FileSystem;
import UnixTools.reduceSpace;

/**
 * Created by gurushan on 1/15/14.
 */
public class reduceSpaceMain {
    public static void main(String[] args) {
        reduceSpace rs = new reduceSpace();
        FileSystem fs = new FileSystem();
        String text ;
        String formattedText;
        try{
            text = fs.readFileContent(args[0]);
            formattedText = rs.getFormattedText(text);
            fs.writeFileContents(args[0],formattedText);
            System.out.println("Extra wide spaces reduced successfully");
        }
        catch(Exception e){
            System.err.println(e);
        }
}
}
