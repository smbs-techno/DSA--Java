package Strings;

public class reversewordsinastring {
    public static String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
            else{
                if(sb.length()>0){
                    sb1.append(sb.reverse().append(" "));
                    sb.setLength(0);
                }
            }
        }
        sb1.append(sb.reverse());
        return sb1.toString().trim();
    }
    public static void main(String[] args) {
        String s="This is a boy";
        System.out.println(reverseWords(s));
    }
}
