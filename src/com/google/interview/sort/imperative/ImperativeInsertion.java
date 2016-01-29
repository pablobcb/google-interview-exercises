package com.google.interview.sort.imperative;

public class ImperativeInsertion {

    public static int[] sort(final int[] array){

        if(array == null) {
            throw new NullPointerException("'unorderedList' cannot be null");
        }

        if(array.length == 0 || array.length == 1) {
            return array;
        }

        for(int sorted = 1; sorted < array.length ; sorted++){
            int sortedElementsLeft = sorted;
            while((sortedElementsLeft > 0) && (array[sortedElementsLeft - 1] > array[sortedElementsLeft])){
                int bigger = array[sortedElementsLeft - 1];
                array[sortedElementsLeft - 1] = array[sortedElementsLeft];
                array[sortedElementsLeft] = bigger;
                sortedElementsLeft--;
            }
        }

        return array;
    }
}
