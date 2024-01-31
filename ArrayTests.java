import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
    @Test 
    public void testReverseInPlaceSingleElement() {
        int[] input = { 3 };
        ArrayExamples.reverseInPlace(input);
        assertArrayEquals(new int[]{ 3 }, input);
    }

    @Test
    public void testReversedEmpty() {
        int[] input = { };
        assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input));
    }

    // New test cases
    @Test
    public void testReverseInPlaceMultipleElements() {
        int[] input = {1, 2, 3, 4};
        ArrayExamples.reverseInPlace(input);
        assertArrayEquals("Should reverse the array in place", new int[]{4, 3, 2, 1}, input);
    }

    @Test
    public void testReversedMultipleElements() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {4, 3, 2, 1};
        assertArrayEquals("Should return a new array with elements in reverse order", expected, ArrayExamples.reversed(input));
    }
}