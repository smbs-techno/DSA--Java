// You are given two strings:

// A (small string)
// B (big string)

// 👉 Check if A is a subsequence of B

// 🔍 What is a Subsequence?

// 👉 Characters of A must appear in B:

// in same order
// not necessarily continuous
// 🧩 Examples
// ❌ Example 1
// A = "data"
// B = "dominant"

// 👉 Order breaks → No

// ✅ Example 2
// A = "algo"
// B = "alligator"

// 👉 a → l → g → o found in order → Yes


package Strings;

public class checksubsequence {
    static boolean solve(String a,String b){
        int i=0,j=0;
        while(i<a.length() && j<b.length()){
            if(a.charAt(i)==b.charAt((j))){
                i++;
            }
            j++;
        }
        if(i==a.length()) return true;
        else return false;
    }
    public static void main(String[] args) {
        String a="algo";
        String b="alligator";
        if(solve(a, b)) System.out.println("Yes");
        else System.out.println("No");
    }
}
