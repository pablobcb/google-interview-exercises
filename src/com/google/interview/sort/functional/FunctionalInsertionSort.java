package com.google.interview.sort.functional;


public class FunctionalInsertionSort {
    private static int [] insertInPlace(final int[] array, final int sortedElementsLeft){

        final boolean hasNext = sortedElementsLeft > 0;
        if(! ( hasNext && (array[sortedElementsLeft - 1] > array[sortedElementsLeft]))){
            return array;
        }

        int bigger = array[sortedElementsLeft - 1];
        array[sortedElementsLeft - 1] = array[sortedElementsLeft];
        array[sortedElementsLeft] = bigger;

        return insertInPlace(array, sortedElementsLeft -1);
    }

    private static int[] insertionSort(final int[] array, final int numSortedElems){
        if(numSortedElems > array.length - 1) {
            return array;
        }

        final int[] arrayWithInsertedElement = insertInPlace(array, numSortedElems);

        return insertionSort(arrayWithInsertedElement, numSortedElems + 1);
    }

    public static int[] sort(final int[] array){
        if(array == null) {
            throw new NullPointerException("'array' cannot be null");
        }

        if(array.length == 0 || array.length == 1) {
            return array;
        }

        return insertionSort(array, 1);
    }
}
