package com.problem.solving.Maths;

import java.util.Arrays;

public class PrimeNosInRange {
    static void checkPrimeInRange(int n) {
        boolean[] checkNotPrime = new boolean[n + 1];
        int sqrtN = (int)Math.sqrt(n);
        for(int i=2; i<=sqrtN; i++){
            if(checkNotPrime[i] == false){
                for(int j=i*i; j<=n; j+=i) {
                    checkNotPrime[j] = true;
                }
            }
        }
        for(int i=2; i<=n; i++) {
            if(checkNotPrime[i] == false) {
                System.out.print(" " + i);
            }
        }
    }
    public static void main(String[] args) {
        checkPrimeInRange(50);
    }
}
