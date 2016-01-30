package com.google.interview.sort.imperative;

import static com.google.interview.sort.SortUtils.swap;

public class ImperativeSelectionSort {

    private static void moveMinToSortedPortion(final int[] array, final int startsAt){
        int min = array[startsAt];
        int minIndex = startsAt;

        for(int i = startsAt + 1 ; i < array.length ;  i++ ){
            if( array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

        swap(array, startsAt, minIndex);
    }

    public static int[] sort(int[] array){
        if(array == null) {
            throw new NullPointerException("'array' cannot be null");
        }

        if(array.length < 2){
            return array;
        }

        for(int i = 0 ; i < array.length - 1 ; i++){
            moveMinToSortedPortion(array, i);
        }

        return array;
    }
}
