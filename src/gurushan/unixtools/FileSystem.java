package gurushan.unixtools;

/**
 * Created by gurushan on 1/9/14.
 */
import java.io.*;

public class FileSystem {
    public String getFileContent(String FileName) throws IOException {
        String line , text = "";
        try{
            FileReader fr = new FileReader(FileName);
            BufferedReader br = new BufferedReader(fr);

            while((line = br.readLine())!= null){
                text += line+'\n';
            }
        }
        catch (Exception e){
            System.err.println(e);
        }
        return text.substring(0,text.length()-1);
    }
}
