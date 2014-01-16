import UnixTools.wc;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by gurushan on 1/16/14.
 */
public class wcTest {
    @Test
    public void testCountLines()throws Exception{
        String input = "a\nb\nc";
        int expected = 3;
        wc Wc = new wc();
        int actual = Wc.countLines(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testCountWords()throws Exception{
        String input = "a b c";
        int expected = 3;
        wc Wc = new wc();
        int actual = Wc.countWords(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testCountCharacters()throws Exception{
        String input = "a b c";
        int expected = 5;
        wc Wc = new wc();
        int actual = Wc.countChar(input);
        assertEquals(expected,actual);
    }
}
