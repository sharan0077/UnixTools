package gurushan.unixtools;

/**
 * Created by gurushan on 1/11/14.
 */
public class tail {
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
            Tail(count,text);
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
    public static void Tail(int count,String text){
        int index , startIndex = 0;
        String[] lines = text.split("\r\n");
        if(lines.length > count)
            startIndex = lines.length - count;
        for(index = startIndex; index < count; index++){
            if(lines.length < 10)count = lines.length;
            System.out.println(lines[index]);
        }
    }
}
