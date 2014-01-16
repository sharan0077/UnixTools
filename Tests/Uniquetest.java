import UnixTools.unique;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class Uniquetest {
        @Test
        public void testGetUniqueLines() throws Exception {
            unique uniq = new unique();
            String text = "a\na\nb\nf\nf\nt\nt\nq";
            String expected = "a\nb\nf\nt\nq";
            String actualText = uniq.getUniqueLines(text);
            assertEquals(expected,actualText);
        }
}
