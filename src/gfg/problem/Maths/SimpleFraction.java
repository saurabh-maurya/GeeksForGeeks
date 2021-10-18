package gfg.problem.Maths;

import java.util.HashMap;
import java.util.Map;

public class SimpleFraction {
    static String simpleFrac(int numerator, int denominator) {
        if (numerator == 0)
            return "0";
        if (denominator == 0)
            return "";

        StringBuilder result = new StringBuilder();
        if ((numerator < 0) ^ (denominator < 0))
            result.append("-");

        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);

        long quo = numerator / denominator;
        long rem = numerator % denominator * 10;

        result.append(String.valueOf(quo));
        if (rem == 0)
            return result.toString();
        result.append(".");
        Map<Long, Integer> m = new HashMap<>();

        while (rem != 0) {

            if (m.containsKey(rem)) {
                int index = m.get(rem);
                String part1 = result.substring(0, index);
                String part2 = "(" + result.substring(index, result.length()) + ")";
                return part1 + part2;
            }
            m.put(rem, result.length());
            quo = rem / denominator;
            result.append(String.valueOf(quo));
            rem = (rem % denominator) * 10;
        }
        return result.toString();
    }
    public static void main(String[] args) {
        int numerator = 50; int denominator = 22;
        System.out.println(simpleFrac(numerator, denominator));
    }
}
