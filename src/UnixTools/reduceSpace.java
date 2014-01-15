package UnixTools;


public class reduceSpace {
    public String getFormattedText(String fileContent){
        return fileContent.replaceAll("\\ +"," ");
    }
}
