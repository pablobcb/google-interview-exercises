package com.google.interview.sort.imperative;

import com.google.interview.sort.TestUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImperativeMergeSortTest extends TestUtils {
    @Test(expected = NullPointerException.class)
    public void comparingWithNullShouldThrowAnException() throws Exception {
        ImperativeMergeSort.sort(null);
    }

    @Test
    public void comparingEmptyArraysShouldSucceed() throws Exception {
        assertArrayEquals(ImperativeMergeSort.sort(this.EMPTY), this.EMPTY);
    }

    @Test
    public void comparingSingleElementsArrayShouldSucceed() throws Exception {
        assertArrayEquals(ImperativeMergeSort.sort(new int[]{1}), this.UNIT);
    }

    @Test
    public void comparingTwoElementsArrayShouldSucceed() throws Exception {
        assertArrayEquals(ImperativeMergeSort.sort(new int[]{252, 111}), this.TWO_ELEMENTS_ARRAY);
    }

    @Test
    public void arrayShouldBeOrderedAfterInsertionSort() throws Exception {
        assertArrayEquals(ImperativeMergeSort.sort(this.UNORDERED), this.ORDERED);
    }

    @Test
    public void orderedArrayShouldStillBeOrderedAfterInsertionSort() throws Exception {
        assertArrayEquals(ImperativeMergeSort.sort(this.ORDERED), this.ORDERED);
    }
}
