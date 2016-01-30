package com.google.interview.sort.imperative;

import static com.google.interview.sort.SortUtils.swap;

public class ImperativeQuickSort {

    private static void movePivotToWall(final int[] array, final int wall, final int end){
        final int oldPivot = array[end];

        for(int i = end - 1 ; i >= wall  ; i--){
            array[i + 1] = array[i];
        }
        array[wall] = oldPivot;
    }

    private static void quickSort(final int[] array, final int begin, final int end){
        if(array.length < 2){
            return;
        }

        if(begin >= end){
            return;
        }
        int pivotIndex = end;
        int wall = begin - 1;
        int pivot = array[pivotIndex];
        for (int cursor = begin; array[cursor] != pivot; cursor++) {
            if(array[cursor] < pivot) {
                wall++;
                swap(array, wall, cursor);
            }
        }
        wall++;
        movePivotToWall(array, wall, end);

        quickSort(array, begin, wall -2);
        quickSort(array, wall, end);
    }
    public static int[] sort(int[] array) {
        if(array == null) {
            throw new NullPointerException("'array' cannot be null");
        }
        quickSort(array, 0, array.length - 1);

        return array;
    }
}
