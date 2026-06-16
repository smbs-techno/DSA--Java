package Strings;
public class processstringwithspecialoperationI {
    public static String processStr(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLowerCase(ch)){
                sb.append(ch);
            }
            else if(ch=='*'){
                if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
            else if(ch=='#'){
                sb.append(sb);
            }
            else if(ch=='%'){
                sb.reverse();
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.print(processStr("ab#c%"));
    }
}
