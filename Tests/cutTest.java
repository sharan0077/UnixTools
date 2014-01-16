import UnixTools.cut;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class cutTest {
    @Test
    public void testgetFields() throws Exception {
        String input = "abc ab\nefg ef\nlmn ln\nyou yu";
        String expected = "ab\nef\nln\nyu\n";
        cut Cut = new cut();
        String actual = Cut.getFields( input,2," ");
        assertEquals(expected, actual);
    }
}
