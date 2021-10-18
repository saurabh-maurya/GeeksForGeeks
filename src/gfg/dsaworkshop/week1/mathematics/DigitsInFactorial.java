package gfg.dsaworkshop.week1.mathematics;

public class DigitsInFactorial {
    static int digitsInFac(int N) {
        double digits = 0;
        for(int i=2; i<=N; i++){
            digits += Math.log10(i);
        }
        return((int)(Math.floor(digits)) + 1);
    }
    public static void main(String[] args){
        int N = 5;
        System.out.println(digitsInFac(N));
    }
}
