package com.google.interview.sort.imperative;

import static com.google.interview.sort.SortUtils.swap;

public class ImperativeInsertionSort {

    private static void insertInPlace(final int[] array, int sortedElementsLeft){
        while((sortedElementsLeft > 0) && (array[sortedElementsLeft - 1] > array[sortedElementsLeft])){
            swap(array, sortedElementsLeft - 1, sortedElementsLeft);
            sortedElementsLeft--;
        }
    }

    public static int[] sort(int[] array){
        if(array == null) {
            throw new NullPointerException("'array' cannot be null");
        }

        for(int sorted = 1; sorted < array.length ; sorted++){
            insertInPlace(array, sorted);
        }

        return array;
    }
}
