package com.zhuravel.find_substring_length;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// Given a string s, find the length of the longest
// substring
// without repeating characters.

// Example 1:
// Input: s "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.

// Example 2:
// Input: s
// Output: 1
// Explanation: The answer is "b", with the length of 1.

// Example 3
// Input: s = "pwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence


// Constraints:

// 0 <= s.length <= 5 - 10^4
// s consists of English letters, digits, symbols and spaces.

/**
 * @author Evgenii Zhuravel created on 01.05.2023
 * @version 1.0
 */
public class Solution {

    public static void main(String[] args) {
        String s;
        s = "abcabcbb";
        System.out.println(s + ": " + lengthOfLongestSubstring(s));
        s = "bbbbb";
        System.out.println(s + ": " + lengthOfLongestSubstring(s));
        s = "pwwkew";
        System.out.println(s + ": " + lengthOfLongestSubstring(s));

        s = "abcabcbb";
        System.out.println(s + ": " + lengthOfLongestSubstring2(s));
        s = "bbbbb";
        System.out.println(s + ": " + lengthOfLongestSubstring2(s));
        s = "pwwkew";
        System.out.println(s + ": " + lengthOfLongestSubstring2(s));
    }
    
    private static int lengthOfLongestSubstring(String s) {
        int maxLength = 1;

        for (int i = 0; i < s.length(); i++) {

            Set<Character> processedChars = new TreeSet<>();
            processedChars.add(s.charAt(i));

            for (int j = i + 1; j < s.length(); j++) {
                if (processedChars.contains(s.charAt(j))) {
                    i = j - 1;
                    break;
                } else {
                    processedChars.add(s.charAt(j));

                    maxLength = Math.max(maxLength, processedChars.size());
                }
            }
        }

        return maxLength;
    }

    private static int lengthOfLongestSubstring2(String s) {
        int start = 0;
        int maxLength = 0;

        Map<Character, Integer> processedChars = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (processedChars.containsKey(c) && start <= processedChars.get(c)) {
                start = processedChars.get(c) + 1;
            } else {
                maxLength = Math.max(maxLength, i - start + 1);
            }

            processedChars.put(c, i);
        }

        return maxLength;
    }
}
