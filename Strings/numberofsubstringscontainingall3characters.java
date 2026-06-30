package Strings;
public class numberofsubstringscontainingall3characters{
    public static int numberOfSubstrings(String s) {
        int count=0;
        int[] freq=new int[3];
        int left=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
           freq[ch-'a']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
            count+=s.length()-right;
            freq[s.charAt(left)-'a']--;
            left++;
           }
        }
        return count;
    }
    public static void main(String[] args) {
        String s="abcabc";
        System.out.print(numberOfSubstrings(s));
    }
}