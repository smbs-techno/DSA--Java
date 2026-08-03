package Strings;

public class mergestringsalternatively {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int i=0,j=0;
        int idx=0;
        while(i<word1.length() && j<word2.length()){
            if(idx%2==0){
                sb.append(word1.charAt(i));
                i++;
                idx++;
            }
            else{
                sb.append(word2.charAt(j));
                j++;
                idx++;
            }
        }
        if(i<word1.length()){
            while(i<word1.length()){
                sb.append(word1.charAt(i++));
            }
        }
        if(j<word2.length()){
            while(j<word2.length()){
                sb.append(word2.charAt(j++));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));
    }
}
