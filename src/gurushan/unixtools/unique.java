package gurushan.unixtools;

/**
 * Created by gurushan on 1/11/14.
 */
public class unique {
    public static void main(String[] args) {
        FileSystem fs = new FileSystem();
        try{
            String text = fs.getFileContent(args[0]);
            Unique(text);
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
    public static void Unique(String text){
        String[] lines = text.split("\n");
        int linesLength = lines.length;
        for(int index = 0; index < linesLength ; index++){
            if( index != linesLength-1 && !(lines[index].equals(lines[index+1]))  )
                System.out.println(lines[index]);
        }
        System.out.println(lines[linesLength-1]);
    }
}
