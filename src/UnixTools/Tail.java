package UnixTools;


public class Tail {
        public String getLines(String fileContent , int count){

            String[] lines = fileContent.split("\n");
            StringBuilder sb = new StringBuilder();
            int startIndex = 0;
            if(lines.length < count)
                count = lines.length;
            else
                startIndex = lines.length - count;
            for(int i = startIndex ; i <= count ; i++){
                if(i != lines.length){
                    sb.append(lines[i]);
                    sb.append('\n');
                }
            }
            return sb.toString();
        }
}
