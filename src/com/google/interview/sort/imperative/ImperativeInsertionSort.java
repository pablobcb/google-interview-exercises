package com.google.interview.sort.imperative;

public class ImperativeInsertionSort {

    private static void insertInPlace(final int[] array, int sortedElementsLeft){
        while((sortedElementsLeft > 0) && (array[sortedElementsLeft - 1] > array[sortedElementsLeft])){
            int bigger = array[sortedElementsLeft - 1];
            array[sortedElementsLeft - 1] = array[sortedElementsLeft];
            array[sortedElementsLeft] = bigger;
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
