package cli;

import FileSystem.FileSystem;
import UnixTools.sort;

public class sortMain {
    public static void main(String[] args) {
         FileSystem fs = new FileSystem();
         sort sorter = new sort();
         String text;
         boolean reverse = false;
         try{
             text = fs.readFileContent(args[0]);
             if(args.length > 1 && args[1].charAt(1) == 'r')
                 reverse = true;
             System.out.println(sorter.getSortedElements(text,reverse));
         }
         catch(Exception e){
            System.err.println(e);
         }
    }
}
