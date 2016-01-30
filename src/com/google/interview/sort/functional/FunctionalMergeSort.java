package com.google.interview.sort.functional;

import java.util.Arrays;

//TODO: refactor everything functional to use these helpers
public class FunctionalMergeSort {

    private static int[] drop(final int[] xs, final int n){
        return Arrays.copyOfRange(xs, n, xs.length);
    }

    private static int[] take(final int[] xs, final int n){
        return Arrays.copyOfRange(xs, 0, n);
    }

    private static int[] concat(final int[] xs, final int[] ys){
        int[] destination =  new int[xs.length + ys.length];

        System.arraycopy(xs, 0, destination, 0, xs.length);
        System.arraycopy(ys, 0, destination, xs.length, ys.length);

        return destination;
    }

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
