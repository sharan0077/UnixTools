package UnixTools;


public class cut {
    public static String getFields(String fileContent,int noOfFields,String delimiter){
        String[] lines  = fileContent.split("\n");
        String[] line;
        String result = "" , words;
        StringBuilder sb = new StringBuilder();
        for(int index = 0;index < lines.length; index++){
            line = lines[index].split(delimiter);
            if(line.length <= noOfFields)
                sb.append(lines[index]);
            else
            {
                for(int i = 0; i < noOfFields ; i++)
                    sb.append(line[i]).append(delimiter);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
