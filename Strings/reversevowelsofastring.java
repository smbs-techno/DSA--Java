package Strings;

public class reversevowelsofastring {
    public static String reverseVowels(String s) {
        StringBuilder ans=new StringBuilder();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                sb.append(ch);
            }
        }
        sb.reverse();
        int idx=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                char ch1=sb.charAt(idx);
                idx++;
                ans.append(ch1);
            }
            else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s="IceCreAm";
        System.out.println(reverseVowels(s));
    }
}
