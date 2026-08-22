package Maths;

public class checkdivisibilitybydigitsumandproduct {
    public static boolean checkDivisibility(int n) {
        int pro=1;
        int sum=0;
        int orig=n;
        while(n!=0){
            int rem=n%10;
            n/=10;
            pro*=rem;
            sum+=rem;
        }
        return orig%(sum+pro)==0;
    }
    public static void main(String[] args) {
        int n=99;
        System.out.println(checkDivisibility(n));
    }
}
