package com.google.interview.util;

public class ArrayUtils {

    public static final int[] UNORDERED = new int[]{ 3, 1, 2, 1, 0, 9, 6, 7, 4, 5};

    public static final int[] ORDERED   = new int[]{ 0, 1, 2, 2, 3, 4, 5, 6, 7, 9};

    public static final int[] EMPTY     = new int[]{};

    public static boolean compareArrays(int[] array1, int[] array2) throws NullPointerException {
        boolean isEqual = true;

        if(array1 == null || array2 == null){
            throw new NullPointerException();
        }

        if (array1.length != array2.length)
            isEqual = false;
        else
            for (int i = 0; i < array2.length; i++){
                if(array2[i] != array1[i]){
                    isEqual = false;
                }
            }

        return isEqual;
    }
}
