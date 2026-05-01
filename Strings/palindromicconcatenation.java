// 🧠 Problem (Simple Words)

// You are given two strings:

// A
// B

// 👉 You need to check:

// Can you pick:

// substring s1 from A
// substring s2 from B

// such that:

// s1 + s2 = palindrome
// 🔍 What is a Palindrome?

// 👉 Same forward and backward

// aa ✔️  
// aba ✔️  
// ab ❌
// 🧩 Important Observation (KEY TRICK)

// 👉 You don’t need to try all substrings ❌

// 👉 Think smallest possible:

// s1 = "x"
// s2 = "x"

// 👉 Result:

// "x" + "x" = "xx" → palindrome ✅
// 🎯 Final Rule

// 👉
// If A and B have ANY common character → YES

// 👉 Otherwise → NO

// 🔍 Examples
// ✅ Example 1
// A = "abc"
// B = "abc"

// Common → a, b, c → YES

// ❌ Example 2
// A = "a"
// B = "b"

// No common → NO

// ✅ Example 3
// A = "abba"
// B = "baab"

// Common exists → YES

// 🧠 Why This Works

// 👉 Because you can always do:

// s1 = "c"
// s2 = "c"

// 👉 giving:

// "cc" → palindrome
// ❌ Wrong Thinking

// Trying:

// all substrings
// checking all combinations

// 👉 Time complexity becomes huge ❌

// ✅ Correct Approach

// 👉 Use HashSet

// Steps:

// Store all characters of A
// Check if any character of B exists in set


package Strings;

import java.util.HashSet;

public class palindromicconcatenation {
    static boolean solve(String a,String b){
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            set.add(ch);
        }
        for(int i=0;i<b.length();i++){
            char ch=b.charAt(i);
            if(set.contains(ch)) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String a="abba";
        String b="baab";
        if(solve(a, b)) System.out.println("Yes");
        else System.out.println("No");
    }
}
