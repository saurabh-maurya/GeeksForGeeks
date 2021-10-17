package com.problem.solving.Maths;

import java.util.Arrays;

public class SmallestPositiveInteger {
    static long smallestPosInt(int[] array) {
        Arrays.sort(array);
        long result = 1;
        for(int i=0; i<array.length; i++) {
            if (array[i] <= result) {
                result += array[i];
            } else {
                return result;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array = {1,1,1,1};
        System.out.println(smallestPosInt(array));
    }
}