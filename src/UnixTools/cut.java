package UnixTools;


public class cut {
    public static String getFields(String fileContent,int fields,String delimiter){
        String[] lines  = fileContent.split("\n");
        String[] line;
        StringBuilder sb = new StringBuilder();
        for(int index = 0;index < lines.length; index++){
            line = lines[index].split(delimiter);
            if(line.length < fields)
                sb.append(lines[index]);
            else
                sb.append(line[fields-1]);
            sb.append("\n");
        }
        return sb.toString();
    }
}
