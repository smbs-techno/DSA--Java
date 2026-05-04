package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class sortcharacterbyfrequency {
    public static String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character> list=new ArrayList<>(map.keySet());
        list.sort((a,b) -> map.get(b)-map.get(a)); //for sorting list
        StringBuilder sb=new StringBuilder();
        for(char c : list){
            int freq=map.get(c);
            while(freq-->0) sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String a="tree";
        System.out.println(frequencySort(a));
    }
}
