package com.google.interview.sort.functional;

import com.google.interview.sort.TestUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionalSelectionSortTest extends TestUtils {
    @Test(expected = NullPointerException.class)
    public void comparingWithNullShouldThrowAnException() throws Exception {
        FunctionalSelectionSort.sort(null);
    }

    @Test
    public void comparingEmptyArraysShouldSucceed() throws Exception {
        assertArrayEquals(FunctionalSelectionSort.sort(this.EMPTY), this.EMPTY);
    }

    @Test
    public void comparingSingleElementsArrayShouldSucceed() throws Exception {
        assertArrayEquals(FunctionalSelectionSort.sort(new int[]{1}), this.UNIT);
    }

    @Test
    public void comparingTwoElementsArrayShouldSucceed() throws Exception {
        assertArrayEquals(FunctionalSelectionSort.sort(new int[]{252, 111}), this.TWO_ELEMENTS_ARRAY);
    }

    @Test
    public void arrayShouldBeOrderedAfterSelectionSort() throws Exception {
        assertArrayEquals(FunctionalSelectionSort.sort(this.UNORDERED), this.ORDERED);
    }

    @Test
    public void orderedArrayShouldStillBeOrderedAfterSelectionSort() throws Exception {
        assertArrayEquals(FunctionalSelectionSort.sort(this.ORDERED), this.ORDERED);
    }

}
