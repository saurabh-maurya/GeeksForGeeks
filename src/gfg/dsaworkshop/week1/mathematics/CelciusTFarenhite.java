package gfg.dsaworkshop.week1.mathematics;

public class CelciusTFarenhite {
    static double c2f(int C) {
        return((C * 9 / 5) + 32);
    }
    public static void main(String[] args){
        int C = 32;
        System.out.println(c2f(C));
    }
}
