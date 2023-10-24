import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests{

    @Test
    public void EmptyTest1(){
        // test that the first node in an empty list returns null
        LinkedList newList = new LinkedList();
        assertEquals(null, newList.first());
    }

    @Test
    public void EmptyTest2(){
        // test that the last node in an empty list returns null
        LinkedList newList = new LinkedList();
        assertEquals(null, newList.last());
    }

    @Test
    public void AppendTest(){
        // test appending
        LinkedList newList = new LinkedList();
        newList.append(1);
        assertEquals(1, newList.first());
        assertEquals(1, newList.last());
    }

    @Test
    public void PrependTest(){
        // test prepending
        LinkedList newList = new LinkedList();
        newList.append(1);
        newList.prepend(3);
        assertEquals(3, newList.first());
        assertEquals(1, newList.last());
    }

    @Test
    public void StringTest(){
        // test toString()
        LinkedList newList = new LinkedList();
        newList.append(1);
        newList.append(2);
        newList.append(3);

        assertEquals("1 2 3", newList.toString());
    }

    @Test
    public void LengthTest1(){
        // test length with empty list
        LinkedList newList = new LinkedList();
        
        assertEquals(0, newList.length());
    }

    @Test
    public void LengthTest2(){
        // test length with a populated list
        LinkedList newList = new LinkedList();
        newList.append(1);
        newList.append(2);
        newList.append(3);

        assertEquals(3, newList.length());
    }
}