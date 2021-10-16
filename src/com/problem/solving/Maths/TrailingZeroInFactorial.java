package com.problem.solving.Maths;

public class TrailingZeroInFactorial {
    public int implement(int N) {
        int trailingZeroCounter = 0;
        for(int i=5; N/i >= 1; i*=5){
            trailingZeroCounter += N/i;
        }
        return trailingZeroCounter;
    }
}
