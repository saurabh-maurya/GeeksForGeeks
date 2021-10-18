package gfg.problem.Maths;

/*
APPROACH -
X  - number that divide N, N - no. to check if it is a prime or not
X^2 = N
X = SQRT(N)
LOOP 2->sqrt(n) if divisible by any no. in the loop, then it is not a prime no. else it is a prime no.
*/

public class IsPrime {
    static boolean checkPrime(int n) {
        int sqrtN = (int)Math.sqrt(n);
        for(int i=2; i<=sqrtN; i++){
            if(n % i == 0){
                return(false);
            }
        }
        return(true);
    }
    public static void main(String[] args) {
        System.out.println(checkPrime(93));
    }
}
