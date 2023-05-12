package com.competition.palindrome;

public class PalindromeSubstring {
    public String longestPalindrome(String s) {
        int n = s.length();
        String substring = "";
        for (int i = 0; i < n/2; i++) {
            for(int j = i;j<n;j++){
                if(s.charAt(i) != s.charAt(n-i-1)){

                }
            }

        }

        return substring;
    }

    public static void main(String[] args) {

    }
}
