/**
 * Created by gurushan on 1/15/14.
 */


import static junit.framework.Assert.assertEquals;

import UnixTools.Head;
import org.junit.Test;

public class headTest {
    @Test
    public void testGetLines() throws Exception {
        Head head = new Head();
        String text = "aa\nbb\ncc\ndd\nhh\noo";
        String expected = "aa\nbb\ncc\n";
        String actualLines;
        actualLines = head.getLines(text, 3);
        assertEquals(expected,actualLines);
    }
    @Test
    public void testGetLinesToReturnTenLinesByDefault() throws Exception{
        Head head = new Head();
        String text = "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\n";
        String expected = "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\n";
        String actualLines;
        actualLines = head.getLines(text, 10);
        assertEquals(expected,actualLines);
    }
}
