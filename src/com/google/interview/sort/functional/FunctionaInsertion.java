package com.google.interview.sort.functional;

import java.util.Arrays;

public class FunctionaInsertion {
    private static int [] insertSorted(final int[] array, final int nextElemIndex, final int sortedElementsLeft){
        if(! ((array[nextElemIndex - 1] > array[nextElemIndex]) && sortedElementsLeft > 0)){
            return array;
        }

        int bigger = array[nextElemIndex - 1];
        array[nextElemIndex - 1] = array[nextElemIndex];
        array[nextElemIndex] = bigger;

        return insertSorted(array, nextElemIndex -1, 0);
    }

    private static int[] insertionSort(final int[] array, final int numSortedElems){
        final int[] arrayWithInsertedElement = insertSorted(array, numSortedElems, numSortedElems);


        return insertionSort(arrayWithInsertedElement, numSortedElems + 1);
    }


    public static int[] sort(final int[] array){

        if(array == null) {
            throw new NullPointerException("'unorderedList' cannot be null");
        }

        return insertionSort(array, 1);
    }
}
