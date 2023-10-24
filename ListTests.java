import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListTests{

    @Test
    public void testFilter(){
        StringChecker sc = new ListExamples();

        List<String> list1 = new ArrayList<String>();
        list1.add("bee");
        list1.add("bees");
        list1.add("baby");
        list1.add("dog");
        list1.add("puppy");

        List<String> expectedList1 = new ArrayList<String>();
        expectedList1.add("bees");
        expectedList1.add("baby");
        expectedList1.add("puppy");

        assertArrayEquals(expectedList1.toArray(), ListExamples.filter(list1, sc).toArray());
    }

    @Test
    public void testMerge(){
        List<String> list1 = new ArrayList<String>();
        list1.add("apple");
        list1.add("bees");

        List<String> list2 = new ArrayList<String>();

        assertArrayEquals(list1.toArray(), ListExamples.merge(list1, list2).toArray());
    }
}
