package Hashing;
import java.util.*;
public class determineiftwostringsareclose{
    public static boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        HashMap<Character,Integer> w1=new HashMap<>();
        HashMap<Character,Integer> w2=new HashMap<>();
        for(int i=0;i<word1.length();i++){
            char ch=word1.charAt(i);
            w1.put(ch,w1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<word2.length();i++){
            char ch=word2.charAt(i);
            w2.put(ch,w2.getOrDefault(ch,0)+1);
        }
        if(!(w1.keySet().equals(w2.keySet()))) return false;
        ArrayList<Integer> list1=new ArrayList<>(w1.values());
        ArrayList<Integer> list2=new ArrayList<>(w2.values());
        Collections.sort(list1);
        Collections.sort(list2);
        return list1.equals(list2);
    }
    public static void main(String[] args) {
       String word1 = "cabbba";
       String word2 = "abbccc";
       System.out.print(closeStrings(word1,word2));
    }
}