package com.google.interview.sort;
import static org.junit.Assert.*;

import org.junit.Test;

public class BubbleTest extends TestUtils {

    @Test(expected = AssertionError.class)
    public void comparingWithNullShouldThrowAnException() throws Exception {
        assertArrayEquals(null, Bubble.sort(this.ORDERED));
    }

    @Test
    public void comparingEmptyArraysShouldSucceed() throws Exception {
        assertArrayEquals(Bubble.sort(this.EMPTY), this.EMPTY);
    }

    @Test
    public void comparingSingleElementsArrayShouldSucceed() throws Exception {
        assertArrayEquals(Bubble.sort(new int[]{1}), this.UNIT);
    }

    @Test
    public void arrayShouldBeOrderedAfterBubbleSort() throws Exception {
        assertArrayEquals(Bubble.sort(this.UNORDERED), this.ORDERED);
    }

    @Test
    public void orderedArrayShouldStillBeOrderedAfterBubbleSort() throws Exception {
        assertArrayEquals(Bubble.sort(this.ORDERED), this.ORDERED);
    }
}