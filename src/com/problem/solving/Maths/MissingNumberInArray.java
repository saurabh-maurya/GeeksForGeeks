package com.problem.solving.Maths;

public class MissingNumberInArray {
    public int  implement(int[] array, int n) {
        int sum = 0;
        for(int i=0; i< array.length; i++){
            sum = sum + array[i];
        }
        int n_sum = ( n * (n + 1))/2;
        return n_sum - sum;
    }
}
