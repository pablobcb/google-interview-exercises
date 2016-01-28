package com.google.interview.sort.functional;
import static org.junit.Assert.*;

import com.google.interview.sort.TestUtils;
import org.junit.Test;

public class FuctionalBubbleTest extends TestUtils {

    @Test(expected = AssertionError.class)
    public void comparingWithNullShouldThrowAnException() throws Exception {
        assertArrayEquals(null, FuctionalBubble.sort(this.ORDERED));
    }

    @Test
    public void comparingEmptyArraysShouldSucceed() throws Exception {
        assertArrayEquals(FuctionalBubble.sort(this.EMPTY), this.EMPTY);
    }

    @Test
    public void comparingSingleElementsArrayShouldSucceed() throws Exception {
        assertArrayEquals(FuctionalBubble.sort(new int[]{1}), this.UNIT);
    }

    @Test
    public void comparingTwoElementsArrayShouldSucceed() throws Exception {
        assertArrayEquals(FuctionalBubble.sort(new int[]{252, 111}), this.TWO_ELEMENTS_ARRAY);
    }

    @Test
    public void arrayShouldBeOrderedAfterBubbleSort() throws Exception {
        assertArrayEquals(FuctionalBubble.sort(this.UNORDERED), this.ORDERED);
    }

    @Test
    public void orderedArrayShouldStillBeOrderedAfterBubbleSort() throws Exception {
        assertArrayEquals(FuctionalBubble.sort(this.ORDERED), this.ORDERED);
    }
}