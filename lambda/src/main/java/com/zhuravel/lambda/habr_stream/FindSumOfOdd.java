package com.zhuravel.lambda.habr_stream;

import java.util.Arrays;
import java.util.List;

public class FindSumOfOdd {

    public static void main(String[] args) {
        List<Integer> collection = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println(findSumOld(collection));
        System.out.println(findSumNew(collection));
    }

    private static int findSumOld(List<Integer> collection) {
        int sumOdd = 0;
        for (Integer i: collection) {
            if (i % 2 != 0) {
                sumOdd += i;
            }
        }
        return sumOdd;
    }

    private static int findSumNew(List<Integer> collection) {
        return collection.stream()
                .filter(o -> o % 2 != 0)
//                .reduce((s1, s2) -> s1 + s2)
//                .reduce((s1, s2) -> Integer.sum(s1, s2))
                .reduce(Integer::sum)
                .orElse(0);
    }
}
