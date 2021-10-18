package gfg.dsaworkshop.week1.mathematics;

public class AdditionUnderModulo {
    static  long addUnderModulo(long a, long b) {
        double a_res = a % 1000000007;
        double b_res = b % 1000000007;
        long res = (long)((a_res + b_res) % 1000000007);
        return res;
    }
    public static void main(String[] args){
        long a = 1000000007;
        long b = 1000000009;
        System.out.println(addUnderModulo(a, b));
    }
}
