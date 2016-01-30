package com.google.interview.sort.functional;

public class FunctionalSelectionSort {

    private static int findMinIndex (final int cursor, final int[] array, int minIndex){
        if(cursor == array.length - 1) {
            return minIndex;
        }

        if( array[cursor + 1] < array[minIndex]) {
            minIndex = cursor + 1;
        }

        return findMinIndex(cursor + 1, array, minIndex);
    }

    private static int[] insertInRightPosition(final int[] array, final int cursor){
        final int minIndex = findMinIndex(cursor, array, cursor);

        int swapBuffer = array[cursor];
        array[cursor] = array[minIndex];
        array[minIndex] = swapBuffer;

        return array;
    }

    private static int[] selectionSort(final int[] array, final int cursor){
        if(cursor == array.length - 1){
            return array;
        }

        return selectionSort(
                insertInRightPosition(array, cursor),
                cursor + 1
        );
    }

    public static int[] sort(int[] array){
        if(array == null) {
            throw new NullPointerException("'array' cannot be null");
        }

        if(array.length < 2){
            return array;
        }

        return selectionSort(array, 0);

    }
}
