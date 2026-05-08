package Strings;

public class checkanagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] freqs=new int[26];
        int[] freqt=new int[26];
        for(int i=0;i<s.length();i++){
            freqs[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            freqt[t.charAt(i)-'a']++;
        }
        for(int i=0;i<freqs.length;i++){
            if(freqs[i]!=freqt[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="anagram"; 
        String t="nagaram";
        System.out.println(isAnagram(s, t));
    }
}
