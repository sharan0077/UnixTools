package gurushan.unixtools;

/**
 * Created by gurushan on 1/11/14.
 */
public class cut {
    public static void main(String[] args) {
        FileSystem fs = new FileSystem();
        String delimiter = " " , text;
        int noOfFields = 0;
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
                    noOfFields = Integer.parseInt(args[1].substring(1));
            }
            text = fs.getFileContent(filename);
            Cut(text,noOfFields,delimiter);
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
    public static void Cut(String text,int noOfFields,String delimiter){
        String[] lines  = text.split("\n");
        String[] line;
        String result = "" , words;
        StringBuilder builder = new StringBuilder();
        for(int index = 0;index < lines.length; index++){
            line = lines[index].split(delimiter);
            if(line.length <= noOfFields)
                result = result + lines[index] + "\r\n";
            else{
                for(int i = 0; i < noOfFields ; i++){
                    result = result + line[i] + delimiter;
                }
                result += "\r\n";
             }
        }
        System.out.println(result);

    }
}