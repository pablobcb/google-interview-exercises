package com.google.interview.sort.imperative;

public class ImperativeBubble {
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
                    int biggerElement = array[currentIndex -1];
                    array[currentIndex -1] = array[currentIndex];
                    array[currentIndex] = biggerElement;
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
