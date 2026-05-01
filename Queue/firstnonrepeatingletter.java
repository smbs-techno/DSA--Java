package Queue;
import java.util.LinkedList;
import java.util.Queue;
public class firstnonrepeatingletter {
    static void solve(String s){
        Queue<Character> qu=new LinkedList<>();
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            qu.offer(ch);
            freq[ch-'a']++;
            while(!(qu.isEmpty()) && freq[qu.peek()-'a']>1){
                qu.poll();
            }
            if(qu.isEmpty()){
                System.out.print("-1 ");
            }
            else System.out.print(qu.peek()+" ");  
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String s="aabccxb";
        solve(s);
    }
}
