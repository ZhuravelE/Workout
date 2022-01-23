package com.zhuravel;

public class SearchMinAndMaxInArray {

    public static void main(String[] args) {
        int[] arraySmall = {20, 91, 64, 75, 19, 26, 48, 55, 89};
        int[] arrayRandom = {70, 79, 98, 13, 75, 96, 24, 36, 88, 85, 47, 85, 56, 32, 5, 69, 86, 45, 82};

        printMaximumElement(arrayRandom);
    }

    static void printMaximumElement(int[] array) {
        int maxIndex = 0;
        int max = array[maxIndex];
        int comparisons = 0;
        int replacements = 0;

        for (int i=0; i<array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                maxIndex = i;
                replacements++;
            }
            comparisons++;
        }

        System.out.println("Max element: " + max);
        System.out.println("Max element index: " + maxIndex);
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Replacements: " + replacements);
    }
}
