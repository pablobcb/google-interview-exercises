package com.google.interview.sort.functional;

import com.google.interview.sort.TestUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionaInsertionTest extends TestUtils{

    @Test(expected = NullPointerException.class)
    public void comparingWithNullShouldThrowAnException() throws Exception {
        FunctionaInsertion.sort(null);
    }

    @Test
    public void comparingEmptyArraysShouldSucceed() throws Exception {
        assertArrayEquals(FunctionaInsertion.sort(this.EMPTY), this.EMPTY);
    }

    @Test
    public void comparingSingleElementsArrayShouldSucceed() throws Exception {
        assertArrayEquals(FunctionaInsertion.sort(new int[]{1}), this.UNIT);
    }

    @Test
    public void comparingTwoElementsArrayShouldSucceed() throws Exception {
        assertArrayEquals(FunctionaInsertion.sort(new int[]{252, 111}), this.TWO_ELEMENTS_ARRAY);
    }

    @Test
    public void arrayShouldBeOrderedAfterInsertionSort() throws Exception {
        assertArrayEquals(FunctionaInsertion.sort(this.UNORDERED), this.ORDERED);
    }

    @Test
    public void orderedArrayShouldStillBeOrderedAfterInsertion() throws Exception {
        assertArrayEquals(FunctionaInsertion.sort(this.ORDERED), this.ORDERED);
    }
}
