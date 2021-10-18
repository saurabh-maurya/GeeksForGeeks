package gfg.problem.Maths;

public class MissingNumberInArray {
    static int missingNumber(int[] array, int n) {
        int sum = 0;
        for(int i=0; i< array.length; i++){
            sum = sum + array[i];
        }
        int n_sum = ( n * (n + 1))/2;
        return n_sum - sum;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,5};
        int n = 5;
        System.out.println(missingNumber(array, n));
    }
}
