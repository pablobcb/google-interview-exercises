package com.google.interview.sort;

import java.util.Arrays;

public class SortUtils {
    public static int[] drop(final int[] xs, final int n){
        return Arrays.copyOfRange(xs, n, xs.length);
    }

    public static int[] take(final int[] xs, final int n){
        return Arrays.copyOfRange(xs, 0, n);
    }

    public static int[] concat(final int[] xs, final int[] ys){
        int[] destination =  new int[xs.length + ys.length];

        System.arraycopy(xs, 0, destination, 0, xs.length);
        System.arraycopy(ys, 0, destination, xs.length, ys.length);

        return destination;
    }

    public static void swap(final int[] array, final int index1, final int index2){
        int swapBuffer = array[index1];
        array[index1] = array[index2];
        array[index2] = swapBuffer;
    }
}
