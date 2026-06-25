package Strings.Substrings;

import java.util.HashMap;

public class countnoofsubstringswithexactlykdistinctcharacters {
    public static int solve(String s, int k){
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int res=0;
        for(int right=0;right<s.length();right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            while(map.size()>k){
                char leftchar=s.charAt(left);
                map.put(leftchar,map.get(leftchar)-1);
                if(map.get(leftchar)==0) map.remove(leftchar);
                left++;
            }
            res+=right-left+1;
        }
        return res;
    }
    public static int string(String s,int k){
        return solve(s, k)-solve(s, k-1);
    }
    public static void main(String[] args) {
        String s="pqpqs";
        int k=2;
        System.out.println(string(s, k));
    }
}
