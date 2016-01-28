package com.google.interview.sort;

public class Bubble {

    /**
     * Swaps sequentially the next 2 slots of the list unless they are ordered
     *
     * @param  unorderedList intermediary structure hold the semi-sorted list
     * @param  unsortedUntil index of the last unsorted slot of the array
     * @return the sorted list after all the recursive calls
     */

    private static int[] bubbleSort(final int[] unorderedList, final int unsortedUntil){
        return unorderedList;
    }

    public static int[] sort(final int[] unorderedList){
        if(unorderedList == null) {
            throw new NullPointerException("'unorderedList' cannot be null");
        }

        if(unorderedList.length == 0 || unorderedList.length == 1) {
            return unorderedList;
        }

        //unorderedList has at least 2 elements
        return bubbleSort(unorderedList, 1);
    }

}
