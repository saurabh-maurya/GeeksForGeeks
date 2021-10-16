package com.problem.solving.Maths;

import java.util.Arrays;

public class SmallestPositiveInteger {
    public long implement(int[] array) {
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
}