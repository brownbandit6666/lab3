import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
@Test
public void filterList() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
@Test
public void filterList2() {
    int[] input1 = { 3 , 4 , 5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 5 , 4 , 3 }, input1);
	}
@Test
public void filterList3() {
    int[] input1 = { };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ }, input1);
	}

}