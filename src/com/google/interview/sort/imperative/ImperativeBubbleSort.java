package com.google.interview.sort.imperative;

import static com.google.interview.sort.SortUtils.swap;

public class ImperativeBubbleSort {
    /**
     * public method which starts the sorting procedure
     *
     * @param  array list to be ordered
     *
     * @return ordered list
     */
    public static int[] sort(final int[] array){
        if(array == null) {
            throw new NullPointerException("'array' cannot be null");
        }

        boolean hasSwapped = false;

        for(int size = array.length ; size > 1 ; size--){

            for(int currentIndex = 1 ; currentIndex < size ; currentIndex++){

                boolean isGreater = array[currentIndex -1] > array[currentIndex];
                if(isGreater){
                    swap(array, currentIndex - 1, currentIndex);
                    hasSwapped = true;
                }
            }
            if (!hasSwapped) {
            /* array finally sorted */
                return array;
            }
        }
        return array;
    }
}
