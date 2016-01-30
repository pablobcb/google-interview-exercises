package com.google.interview.sort.functional;

import static com.google.interview.sort.SortUtils.swap;

public class FunctionalBubbleSort {

    /**
     * Swaps sequentially the next 2 slots of the list unless they are ordered
     *
     * @param  array intermediary structure hold the semi-sorted list,
     *                       with 2 elements at least
     *
     * @param  currentIndex index from the second slot of the ROI in the comparison
     *
     * @param  size number representing the index of the last unsorted slot
     *
     * @param  hasSwapped boolean indicating if there was a swap operation
     *
     * @return the sorted list after all the CPS recursive calls
     */
    private static int[] bubbleSort(final int[] array, final int size, final int currentIndex, boolean hasSwapped){

        boolean hasNext = currentIndex < size;
        if(hasNext) {

            /* swaps two elements if the first is greater than the second */
            boolean isGreater = array[currentIndex -1] > array[currentIndex];
            if(isGreater){
                swap(array, currentIndex -1, currentIndex);
                hasSwapped = true;
            }

            return bubbleSort(array, size, currentIndex + 1, hasSwapped);
        }

        /* reachead the end */
        if (!hasSwapped) {
            /* array finally sorted */
            return array;
        }

        /* resets the bubblesort reducing the ROI */
        return bubbleSort(array, size - 1, 1, false);
    }

    /**
     * public method which starts the sorting procedure
     *
     * @param  unorderedArray list to be ordered
     *
     * @return ordered list
     */
    public static int[] sort(final int[] unorderedArray){
        if(unorderedArray == null) {
            throw new NullPointerException("'unorderedList' cannot be null");
        }

        //unorderedList has at least 2 elements
        return bubbleSort(unorderedArray, unorderedArray.length, 1, false);
    }
}
