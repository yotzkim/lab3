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
  public void testReverseInPlaceNoWork(){
    int[] i = {50, 51, 52};
    ArrayExamples.reverseInPlace(i);
    assertArrayEquals(new int[]{52, 51, 50}, i);
  }

  @Test
  public void testReversedNoWork(){
    int[] m = {70, 71, 72};
    assertArrayEquals(new int[]{72, 71, 70}, ArrayExamples.reversed(m));
  }
}
