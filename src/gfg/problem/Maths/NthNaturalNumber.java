package gfg.problem.Maths;

import java.util.HashMap;
import java.util.Map;

public class NthNaturalNumber {
    static long nNaturalNum(long N) {
        long result = 0;
        long digitPos = 1;
        while (N > 0) {
            result += (digitPos * (N % 9));
            N = N / 9;
            digitPos = digitPos * 10;
        }
        return result;
    }
    public static void main(String[] args) {
        long N = 100;
        System.out.println(nNaturalNum(N));
    }
}
