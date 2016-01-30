package com.google.interview.sort.imperative;

import java.util.Arrays;

// trocar essa versao para depois usar indices
public class ImperativeMergeSort {
    private static void merge(int[] destination, final int[] a1, final int[] a2){
        int cursorA1 = 0;
        int cursorA2 = 0;
        int cursorDestination = 0;

        while(cursorA1 < a1.length && cursorA2 < a2.length){
            if(a1[cursorA1] < a2[cursorA2]){
                destination[cursorDestination] = a1[cursorA1];
                cursorA1++;
            }
            else {
                destination[cursorDestination] = a2[cursorA2];
                cursorA2++;
            }
            cursorDestination++;
        }

        System.arraycopy(a1, cursorA1, destination, cursorDestination, a1.length - cursorA1);
        System.arraycopy(a2, cursorA2 , destination, cursorDestination, a2.length - cursorA2);
    }

    private static void mergeSort(int[] array){
        if(array.length == 1){
            return;
        }

        int mediumIndex = array.length/2;

        int[] leftArray = Arrays.copyOfRange(array, 0, mediumIndex);
        int[] rightArray = Arrays.copyOfRange(array, mediumIndex, array.length);

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(array, leftArray, rightArray);
    }

    public static int[] sort(int[] array){
        if(array == null) {
            throw new NullPointerException("'array' cannot be null");
        }

        if(array.length == 0 || array.length == 1){
            return array;
        }

        mergeSort(array);

        return array;
    }
}
