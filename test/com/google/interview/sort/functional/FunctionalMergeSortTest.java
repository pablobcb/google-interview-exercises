package com.google.interview.sort.functional;

import com.google.interview.sort.TestUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionalMergeSortTest extends TestUtils {
    @Test(expected = NullPointerException.class)
    public void comparingWithNullShouldThrowAnException() throws Exception {
        FunctionalMergeSort.sort(null);
    }

    @Test
    public void comparingEmptyArraysShouldSucceed() throws Exception {
        assertArrayEquals(FunctionalMergeSort.sort(this.EMPTY), this.EMPTY);
    }

    @Test
    public void comparingSingleElementsArrayShouldSucceed() throws Exception {
        assertArrayEquals(FunctionalMergeSort.sort(new int[]{1}), this.UNIT);
    }

    @Test
    public void comparingTwoElementsArrayShouldSucceed() throws Exception {
        assertArrayEquals(FunctionalMergeSort.sort(new int[]{252, 111}), this.TWO_ELEMENTS_ARRAY);
    }

    @Test
    public void arrayShouldBeOrderedAfterMergeSort() throws Exception {
        assertArrayEquals(FunctionalMergeSort.sort(this.UNORDERED), this.ORDERED);
    }

    @Test
    public void orderedArrayShouldStillBeOrderedAfterMergeSort() throws Exception {
        assertArrayEquals(FunctionalMergeSort.sort(this.ORDERED), this.ORDERED);
    }
}
