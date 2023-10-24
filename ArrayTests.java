import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  // One symptom of a bug in reverseInPlace() is that
  // you won't actually get a reversed array in an asymmetric array
  @Test
  public void testReverseInPlace1(){
    int [] input2 = {1, 2, 3};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[] {3, 2, 1}, input2);
  }

  // One symptom of a bug in reverse is that we get a blank array
  @Test
  public void testReversed1(){
    int[] input2 = {1, 2, 3};
    assertArrayEquals(new int[] {3, 2, 1}, ArrayExamples.reversed(input2));
  }

  @Test
  public void testAverageWithoutLowest(){
    double[] input3 = {2, 3, 2, 4};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input3), 0.01);
  }
}
