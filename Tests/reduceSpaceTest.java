import UnixTools.reduceSpace;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by gurushan on 1/15/14.
 */
public class reduceSpaceTest {
    @Test
    public void testgetFormattedText() throws Exception {
        reduceSpace trim = new reduceSpace();
        String text = "abc     efg      lmn  qwe    u";
        String expectedText = "abc efg lmn qwe u";
        String actualText = trim.getFormattedText(text);
        assertEquals(expectedText, actualText);
    }
}
