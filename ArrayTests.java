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


  @Test
  public void testReverseInPlaceWithLongArray(){
    int[] input1 = { 3, 5, 6, 7, 8, 9 };
    int[] arr = { 9, 8, 7, 6, 5, 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(arr, input1);
  }

  @Test
  public void testReversedWithLongArray(){
    int[] input1 = { 3, 5, 6, 7, 8, 9 };
    int[] arr = { 9, 8, 7, 6, 5, 3 };
    assertArrayEquals(arr, ArrayExamples.reversed(input1));
  }
}
