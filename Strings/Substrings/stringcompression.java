package Strings.Substrings;

public class stringcompression {
         public static int compress(char[] chars) {
       int idx=0;
       int i=0;
       while(i<chars.length){
        int count=0;
        char curr=chars[i];
        while(i<chars.length && chars[i]==curr){
            count++;
            i++;
        }
        chars[idx++]=curr;
        if(count>1){
            for(char c : String.valueOf(count).toCharArray()){
                chars[idx++]=c;
            }
        }
       }
       return idx;
    }
    
    public static void main(String[] args){
        char[] s={'a','a','a','b','b','c','c'};
        System.out.println(compress(s));
    }
}
