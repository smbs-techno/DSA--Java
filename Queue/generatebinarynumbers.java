package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class generatebinarynumbers {
    static void solve(int n){
        Queue<String> qu=new LinkedList<>();
        qu.add("1");
        while(n-->0){
            String s1=qu.peek();
            System.out.print(qu.poll() + " ");
            String s2=s1;
            qu.add(s1 + "0");
            qu.add(s2 + "1");
        }
    }
    public static void main(String[] args) {
        int n=5;
        solve(n);
    }
}
