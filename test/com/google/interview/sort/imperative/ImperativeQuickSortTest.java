package com.google.interview.sort.imperative;

import com.google.interview.sort.TestUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImperativeQuickSortTest extends TestUtils {
    @Test(expected = NullPointerException.class)
    public void comparingWithNullShouldThrowAnException() throws Exception {
        ImperativeQuickSort.sort(null);
    }

    @Test
    public void comparingEmptyArraysShouldSucceed() throws Exception {
        assertArrayEquals(ImperativeQuickSort.sort(this.EMPTY), this.EMPTY);
    }

    @Test
    public void comparingSingleElementsArrayShouldSucceed() throws Exception {
        assertArrayEquals(ImperativeQuickSort.sort(new int[]{1}), this.UNIT);
    }

    @Test
    public void comparingTwoElementsArrayShouldSucceed() throws Exception {
        assertArrayEquals(ImperativeQuickSort.sort(new int[]{252, 111}), this.TWO_ELEMENTS_ARRAY);
    }

    @Test
    public void arrayShouldBeOrderedAfterQuickSort() throws Exception {
        assertArrayEquals(ImperativeQuickSort.sort(this.UNORDERED), this.ORDERED);
    }

    @Test
    public void orderedArrayShouldStillBeOrderedAfterQuickSort() throws Exception {
        assertArrayEquals(ImperativeQuickSort.sort(this.ORDERED), this.ORDERED);
    }

}
