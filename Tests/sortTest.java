import UnixTools.sort;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by gurushan on 1/16/14.
 */
public class sortTest {
    @Test
    public void testGetSortedElements()throws Exception{
        sort Sort = new sort();
        String input = "d\nc\nb\na";
        String expected = "a\nb\nc\nd\n";
        String actual = Sort.getSortedElements(input,false);
        assertEquals(actual,expected);
    }
    @Test
    public void testGetSortedElementsToSortInReverseOrder()throws Exception{
        sort Sort = new sort();
        String input = "a\nb\nc\nd\n";
        String expected = "d\nc\nb\na\n";
        String actual = Sort.getSortedElements(input,true);
        assertEquals(actual,expected);
    }
}
