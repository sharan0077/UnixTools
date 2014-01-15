package UnixTools;

import java.util.Arrays;
import java.util.Collections;


public class sort {
    public String getSortedElements(String fileContent, boolean reverse) {
        String[] lines = fileContent.split("\n");
        StringBuilder sb = new StringBuilder();
        if (reverse)
            Arrays.sort(lines, Collections.reverseOrder());
        else
            Arrays.sort(lines);
        for (String line : lines) {
            sb.append(line).append("\n");
        }
        return sb.toString();
    }
}

