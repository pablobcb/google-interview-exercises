package com.google.interview.sort.imperative;

import com.google.interview.sort.TestUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImperativeInsertionTest extends TestUtils{

    @Test(expected = AssertionError.class)
    public void comparingWithNullShouldThrowAnException() throws Exception {
        assertArrayEquals(null, ImperativeInsertion.sort(this.ORDERED));
    }

    @Test
    public void comparingEmptyArraysShouldSucceed() throws Exception {
        assertArrayEquals(ImperativeInsertion.sort(this.EMPTY), this.EMPTY);
    }

    @Test
    public void comparingSingleElementsArrayShouldSucceed() throws Exception {
        assertArrayEquals(ImperativeInsertion.sort(new int[]{1}), this.UNIT);
    }

    @Test
    public void comparingTwoElementsArrayShouldSucceed() throws Exception {
        assertArrayEquals(ImperativeInsertion.sort(new int[]{252, 111}), this.TWO_ELEMENTS_ARRAY);
    }

    @Test
    public void arrayShouldBeOrderedAfterInsertionSort() throws Exception {
        assertArrayEquals(ImperativeInsertion.sort(this.UNORDERED), this.ORDERED);
    }

    @Test
    public void orderedArrayShouldStillBeOrderedAfterInsertion() throws Exception {
        assertArrayEquals(ImperativeInsertion.sort(this.ORDERED), this.ORDERED);
    }
}
