package com.google.interview.sort.functional;


import static com.google.interview.sort.SortUtils.swap;

public class FunctionalInsertionSort {
    private static int [] insertInPlace(final int[] array, final int sortedElementsLeft){
        final boolean hasNext = sortedElementsLeft > 0;
        if(! ( hasNext && (array[sortedElementsLeft - 1] > array[sortedElementsLeft]))){
            return array;
        }
        swap(array, sortedElementsLeft -1, sortedElementsLeft);
        return insertInPlace(array, sortedElementsLeft -1);
    }

    private static int[] insertionSort(final int[] array, final int numSortedElems){
        if(array.length - 1 < numSortedElems) {
            return array;
        }

        return insertionSort(
                insertInPlace(array, numSortedElems),
                numSortedElems + 1
        );
    }

    public static int[] sort(final int[] array){
        if(array == null) {
            throw new NullPointerException("'array' cannot be null");
        }

        if(array.length < 2){
            return array;
        }

        return insertionSort(array, 1);
    }
}
