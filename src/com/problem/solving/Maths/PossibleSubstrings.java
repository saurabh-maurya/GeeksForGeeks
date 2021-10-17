package com.problem.solving.Maths;

public class PossibleSubstrings {
    static void allSubstring(String str) {
        String res;
        for(int i=0; i<str.length(); i++){
            res = "";
            for(int j=i; j<str.length(); j++){
                res = res + str.charAt(j);
                System.out.println(res);
            }
        }
    }
    public static void main(String[] args) {
        String str = "abcde";
        allSubstring(str);
    }
}
