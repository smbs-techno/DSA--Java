package Maths;
public class countdigitsdthatdivideanumber{
    public static int countDigits(int num) {
        int x=num;
        int count=0;
        while(x>0){
            int d=x%10;
            if(num%d==0) count++;
            x=x/10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countDigits(12178));
    }
}