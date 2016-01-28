package com.google.interview.sort;
import static org.junit.Assert.*;

import com.google.interview.util.ArrayUtils;
import org.junit.Test;

public class BubbleTest {

    @Test(expected = AssertionError.class)
    public void comparingWithNullShouldThrowAnException() throws Exception {
        assertArrayEquals(null, Bubble.sort(ArrayUtils.ORDERED));
    }

    @Test
    public void comparingEmptyArraysShouldSucceed() throws Exception {
        assertArrayEquals(Bubble.sort(ArrayUtils.EMPTY), ArrayUtils.EMPTY);
    }

    @Test
    public void comparingSingleElementsArray() throws Exception {
        assertArrayEquals(Bubble.sort(new int[]{1}), ArrayUtils.UNIT);
    }
}