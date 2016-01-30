package com.google.interview.sort.functional;

import java.util.Arrays;

import static com.google.interview.sort.SortUtils.*;

public class FunctionalMergeSort {
    private static int[] merge(final int[] a1, final int[] a2){
        if(a1.length == 0) {
            return a2;
        }
        if(a2.length == 0) {
            return a1;
        }

        if(a1[0] < a2[0]) {
            final int head = a1[0];
            return concat(new int[]{head}, merge(drop(a1, 1), a2));
        }
        else{
            final int head = a2[0];
            return concat(new int[]{head}, merge(a1, drop(a2, 1)));
        }
    }

    private static int[] mergeSort(int[] array){
        if(array.length < 2){
            return array;
        }
        int mediumIndex = array.length/2;

        return merge(
            mergeSort(take(array, mediumIndex)),
            mergeSort(drop(array, mediumIndex))
        );
    }

    public static int[] sort(int[] array){
        if(array == null) {
            throw new NullPointerException("'array' cannot be null");
        }

        return mergeSort(array);
    }
}
