package UnixTools;

/**
 * Created by gurushan on 1/14/14.
 */
public class Head {
    public String getLines(String fileContent , int count){
        String[] lines = fileContent.split("\n");
        StringBuilder sb = new StringBuilder();
        if(lines.length < count)
            count = lines.length;
        for(int i = 0 ; i < count ; i++){
            sb.append(lines[i]);
            sb.append('\n');
        }
        return sb.toString();
    }
}
