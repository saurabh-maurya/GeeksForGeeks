package gfg.dsaworkshop.week1.mathematics;

public class SmallestDivisibleNumber {
    static long gcd(long num1, long num2)
    {
        if(num1 % num2 != 0)
            return gcd(num2, num1 % num2);
        else
            return num2;
    }
    static long lcm(long n)
    {
        long result = 1;
        for (long i = 1; i <= n; i++)
            result = (result * i)/(gcd(result, i));
        return result;
    }

    public static void main(String[] args){
        // smallest divisible number is nothing but lcm
        int n = 4;
        System.out.println(lcm(n));
    }
}
