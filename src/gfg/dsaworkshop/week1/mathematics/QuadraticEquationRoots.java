package gfg.dsaworkshop.week1.mathematics;

import java.util.ArrayList;

public class QuadraticEquationRoots {
    static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        int d = b * b - 4 * a * c;
        double sqrt_val = Math.sqrt(Math.abs(d));
        if (d > 0) {
            if (-b > 0) {
                result.add((int) (-b + sqrt_val) / (2 * a));
                result.add((int) (-b - sqrt_val) / (2 * a));
            } else {
                result.add((int) (-b - sqrt_val) / (2 * a));
                result.add((int) (-b + sqrt_val) / (2 * a));
            }
        } else if (d == 0) {
            result.add(-(int) b / (2 * a));
            result.add(-(int) b / (2 * a));
        } else {
            result.add(-1);
            result.add(-1);
        }
        return (result);
    }
    public static void main(String[] args){
        int a = 752;
        int b = 904;
        int c = 164;
        System.out.println(quadraticRoots(a, b, c));
    }
}
