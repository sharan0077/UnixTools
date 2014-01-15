package cli;

import FileSystem.FileSystem;
import UnixTools.cut;

/**
 * Created by gurushan on 1/15/14.
 */
public class cutMain {
    public static void main(String[] args) {
        FileSystem fs = new FileSystem();
        cut Cut = new cut();
        String delimiter = " " , text;
        int noOfFields = 0;
        String fields;
        try{
            String filename = args[0];
            if (args.length == 3) {
                delimiter = args[2].substring(2);
                if (args[1].startsWith("-")) {
                    noOfFields = Integer.parseInt(args[1].substring(2));
                }
            }
            if (args.length == 2) {
                if (args[1].startsWith("-"))
                    noOfFields = Integer.parseInt(args[1].substring(2));
            }
            text = fs.readFileContent(filename);
            fields = Cut.getFields(text,noOfFields,delimiter);
            System.out.println(fields);
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
}
