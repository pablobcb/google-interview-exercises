package com.google.interview.sort.functional;
import static org.junit.Assert.*;

import com.google.interview.sort.TestUtils;
import org.junit.Test;

public class FunctionalBubbleTest extends TestUtils {

    @Test(expected = NullPointerException.class)
    public void comparingWithNullShouldThrowAnException() throws Exception {
        FunctionalBubble.sort(null);
    }

    @Test
    public void comparingEmptyArraysShouldSucceed() throws Exception {
        assertArrayEquals(FunctionalBubble.sort(this.EMPTY), this.EMPTY);
    }

    @Test
    public void comparingSingleElementsArrayShouldSucceed() throws Exception {
        assertArrayEquals(FunctionalBubble.sort(new int[]{1}), this.UNIT);
    }

    @Test
    public void comparingTwoElementsArrayShouldSucceed() throws Exception {
        assertArrayEquals(FunctionalBubble.sort(new int[]{252, 111}), this.TWO_ELEMENTS_ARRAY);
    }

    @Test
    public void arrayShouldBeOrderedAfterBubbleSort() throws Exception {
        assertArrayEquals(FunctionalBubble.sort(this.UNORDERED), this.ORDERED);
    }

    @Test
    public void orderedArrayShouldStillBeOrderedAfterBubbleSort() throws Exception {
        assertArrayEquals(FunctionalBubble.sort(this.ORDERED), this.ORDERED);
    }
}
