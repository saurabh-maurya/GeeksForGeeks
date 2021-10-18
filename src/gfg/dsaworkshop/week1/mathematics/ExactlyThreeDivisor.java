package gfg.dsaworkshop.week1.mathematics;

public class ExactlyThreeDivisor {
    static int exactly3Divisors(int N) {
        // code here
        int result = 0;
        for(int i=2; i<=(int)Math.sqrt(N); i++){
            if(i * i <= N){
                result += 1;
            }
        }
        return(result);
    }
    public static void main(String[] args){
        int N = 10;
        System.out.println(exactly3Divisors(N));
    }
}
