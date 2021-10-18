package gfg.dsaworkshop.week1.mathematics;

public class IsPrime {
    static boolean checkPrime(int N) {
        // code here
        for(int i=2; i<=(int)(Math.sqrt(N)); i++){
            if(N % i == 0){
                return(false);
            }
        }
        return(true);
    }
    public static void main(String[] args){
        int N = 49;
        System.out.println(checkPrime(N));
    }
}
