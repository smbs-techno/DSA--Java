package Strings.Substrings;

public class removealloccurrencesofastring {
    public static String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder(s);
        int idx;
        while((idx=sb.indexOf(part))!=-1){
            sb.delete(idx,idx+part.length());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="daabcbaabcbc", part = "abc";
        System.out.println(removeOccurrences(s, part));
    }
}
