package Maths;
public class add_digits{
    public static int addDigits(int num) {
        if(num>=0 && num<=9) return num;
        int ans=num;
        int sum=0;
        while(num>0){
            sum=0;
            while(ans>0){
                int d=ans%10;
                sum+=d;
                ans=ans/10;
            }
            if(sum>=0 && sum<=9) return sum;
            ans=sum;
        }
        return 0;
    }
    public static void main(String[] args){
        System.out.print(addDigits(38));
    }
}
