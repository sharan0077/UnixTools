package UnixTools;


public class Tail {
        public String getLines(String fileContent , int count){

            String[] lines = fileContent.split("\n");
            StringBuilder sb = new StringBuilder();
            int startIndex = 0;
            if(lines.length < count)
                count = lines.length;
            startIndex = lines.length - count;
            for(int i = startIndex ; i < lines.length ; i++)
                sb.append(lines[i]).append('\n');
            return sb.toString();
        }
}
