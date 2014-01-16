import UnixTools.Tail;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by gurushan on 1/16/14.
 */
public class tailTest {
    @Test
    public void testGetLines() throws Exception {
        Tail tail = new Tail();
        String text = "aa\nbb\ncc\ndd\nhh\noo";
        String expected = "dd\nhh\noo\n";
        String actualLines;
        actualLines = tail.getLines(text, 3);
        assertEquals(expected,actualLines);
    }
    @Test
    public void testGetLinesToReturnTenLinesByDefault() throws Exception{
       Tail tail = new Tail();
        String text = "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no";
        String expected = "f\ng\nh\ni\nj\nk\nl\nm\nn\no\n";
        String actualLines;
        actualLines = tail.getLines(text, 10);
        assertEquals(expected,actualLines);
    }
}
