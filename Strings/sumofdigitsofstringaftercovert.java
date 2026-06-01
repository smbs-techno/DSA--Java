package Strings;
public class sumofdigitsofstringaftercovert{
    public static int getLucky(String s, int k) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int val=ch-'a'+1;
            while(val>0){
                int d=val%10;
                sum+=d;
                val=val/10;
            }
        }
        int k1=k-1;
        while(k1-->0){
            int newsum=0;
            while(sum>0){
                int d=sum%10;
                newsum+=d;
                sum=sum/10;
            }
            sum=newsum;
        }
        return sum;
    }
    public static void main(String[] args) {
        String s ="zbax";
        int k=2;
        System.out.println(getLucky(s, k));
    }
}