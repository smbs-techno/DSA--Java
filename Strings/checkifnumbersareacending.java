package Strings;

public class checkifnumbersareacending {
    public static boolean areNumbersAscending(String s) {
        int prev=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                sb.append(ch);
            }
            else{
                if(!sb.isEmpty()){
                    int curr=Integer.parseInt(sb.toString());
                    if(curr<=prev){
                        return false;
                    }
                    prev=curr;
                    sb.setLength(0);
                }
            }
        }
        if(!sb.isEmpty()){
            int curr=Integer.parseInt(sb.toString());
            if(curr<=prev){
                return false;
            }
            prev=curr;
            sb.setLength(0);
        }
        return true;
    }
    public static void main(String[] args) {
         String s="1 box has 3 blue 4 red 6 green and 12 yellow marbles";
         System.out.print(areNumbersAscending(s));
    }
}
