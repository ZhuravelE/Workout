package com.zhuravel;

/**
 * @author Evgenii Zhuravel created on 11.05.2023
 * @version 1.0
 */
public class GCDFinder {

    public static int findGCD(int a, int b) {
        int t;

        while (b != 0) {
            t = a;
            a = b;
            b = t % b;
        }

        return a;
    }
}
