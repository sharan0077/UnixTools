package UnixTools;

/**
 * Created by gurushan on 1/15/14.
 */
public class unique {
    public String getUniqueLines(String fileContent){
        String[] lines = fileContent.split("\n");
        StringBuilder sb = new StringBuilder();
        int index;
        for(index = 0; index < lines.length -1 ; index++){
            if(!(lines[index].equals(lines[index+1]))){
                sb.append(lines[index]);
                sb.append('\n');
            }
        }
        sb.append(lines[index]);
        return sb.toString();
    }
}
