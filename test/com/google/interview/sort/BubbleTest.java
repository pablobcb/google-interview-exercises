package com.google.interview.sort;

import com.google.interview.util.ArrayUtils;
import org.junit.Test;

import static com.google.interview.util.ArrayUtils.compareArrays;

public class BubbleTest {

    @Test
    public void comparingEmptyArraysShouldFail() throws Exception {
        assert compareArrays(Bubble.sort(ArrayUtils.EMPTY), ArrayUtils.EMPTY);
    }

    @Test(expected = NullPointerException.class)
    public void comparingWithNullShouldThrowAnException() throws Exception {
        compareArrays(Bubble.sort(ArrayUtils.EMPTY), null);
    }
}