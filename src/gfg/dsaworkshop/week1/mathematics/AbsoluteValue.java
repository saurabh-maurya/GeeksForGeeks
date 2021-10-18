package gfg.dsaworkshop.week1.mathematics;

public class AbsoluteValue {
    static int absolute(int I) {
        return(I < 0 ? I * -1 : I);
    }
    public static void main(String[] args){
        int I = 9;
        System.out.println(absolute(I));
    }
}
