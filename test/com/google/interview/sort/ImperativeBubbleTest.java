package com.google.interview.sort;

import org.junit.Test;

import static com.google.interview.sort.ImperativeBubble.*;
import static org.junit.Assert.*;

public class ImperativeBubbleTest extends TestUtils{
    @Test(expected = AssertionError.class)
    public void comparingWithNullShouldThrowAnException() throws Exception {
        assertArrayEquals(null, ImperativeBubble.sort(this.ORDERED));
    }

    @Test
    public void comparingEmptyArraysShouldSucceed() throws Exception {
        assertArrayEquals(ImperativeBubble.sort(this.EMPTY), this.EMPTY);
    }

    @Test
    public void comparingSingleElementsArrayShouldSucceed() throws Exception {
        assertArrayEquals(ImperativeBubble.sort(new int[]{1}), this.UNIT);
    }

    @Test
    public void comparingTwoElementsArrayShouldSucceed() throws Exception {
        assertArrayEquals(ImperativeBubble.sort(new int[]{252, 111}), this.TWO_ELEMENTS_ARRAY);
    }

    @Test
    public void arrayShouldBeOrderedAfterBubbleSort() throws Exception {
        assertArrayEquals(ImperativeBubble.sort(this.UNORDERED), this.ORDERED);
    }

    @Test
    public void orderedArrayShouldStillBeOrderedAfterBubbleSort() throws Exception {
        assertArrayEquals(ImperativeBubble.sort(this.ORDERED), this.ORDERED);
    }
}