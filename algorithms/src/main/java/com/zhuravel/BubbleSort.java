package com.zhuravel;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] randomArray = {70, 79, 98, 13, 75, 96, 24, 36, 88, 85, 47, 85, 56, 32, 5, 69, 86, 45, 82};
        int[] sortedArray = bubbleSort(randomArray);

        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
    }

    private static int[] bubbleSort(int[] array) {
        int comparisons = 0;
        int swaps = 0;
        int buf;
        boolean sorted = false;

        while(!sorted) {
            sorted = true;
            for(int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]) {
                    System.out.println("Swap " + array[i] + " and " + array[i+1]);
                    sorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;

                    swaps++;
                } else {
                    System.out.println("No need to change elements " + array[i] + " and " + array[i+1]);
                }
                comparisons++;
            }
        }

        System.out.println("Swaps " + swaps);
        System.out.println("Comparisons " + comparisons);

        return array;
    }
}
