package gurushan.unixtools;

/**
 * Created by gurushan on 1/13/14.
 */
public class ReduceSpace {
    public static void main(String[] args) {
        FileSystem fs = new FileSystem();
        String text = "";
        String formattedText;
        try{
            text = fs.getFileContent(args[0]);
            formattedText = text.replaceAll("\\ +"," ");
            fs.writeFileContents(args[0],formattedText);
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
}
