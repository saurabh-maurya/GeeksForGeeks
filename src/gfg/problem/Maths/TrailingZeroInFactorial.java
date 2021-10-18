package gfg.problem.Maths;

public class TrailingZeroInFactorial {
    static int trailingZeroFact(int N) {
        int trailingZeroCounter = 0;
        for(int i=5; N/i >= 1; i*=5){
            trailingZeroCounter += N/i;
        }
        return trailingZeroCounter;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(trailingZeroFact(n));
    }
}
