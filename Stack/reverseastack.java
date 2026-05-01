package Stack;
import java.util.*;

public class reverseastack {
     static void pushbottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushbottom(s, data);
        s.push(top);
    }
     static void reversestack(Stack<Integer> s){
        if(s.isEmpty()) return;
        int top=s.pop();
        reversestack(s);
        pushbottom(s, top);
     }
     public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reversestack(s);
        System.out.println(s);
     }
}
