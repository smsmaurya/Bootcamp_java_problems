package com.bridgeLab.solution.logicalPractice;

public class StringComparison {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "helloworld";
        
        int result = compareStrings(str1, str2);
        
        if (result == 0) {
            System.out.println("The two strings are equal.");
        } else if (result == -1) {
            System.out.println("The second string's size is greater than the first string.");
        } else {
            System.out.println("The strings differ at position: " + result);
        }
    }
    
    public static int compareStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        
        if (len2 > len1) {
            return -1;
        }
        
        for (int i = 0; i < len2; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return i;
            }
        }
        
        return 0;
    }
}

