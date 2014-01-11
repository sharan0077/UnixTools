import gurushan.unixtools.FileSystem;

/**
 * Created by gurushan on 1/11/14.
 */
public class head {
    public static void main(String[] args) {
        FileSystem fs = new FileSystem();
        String text = "";
        int count = 10;
        try{
            if(args[0].startsWith("-")){
                text = fs.getFileContent(args[1]);
                count = Integer.parseInt(args[0].substring(1));
            }
            else
                text = fs.getFileContent(args[0]);
            Head(count,text);
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
    public static void Head(int count,String text){
        String[] lines = text.split("\r\n");
        for(int index = 0; index < count; index++){
            if(lines.length < 10)count = lines.length;
            System.out.println(lines[index]);
        }
    }
}
