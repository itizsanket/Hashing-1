// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

package Hashing-1.Problem2-IsomorphicStrings;

//Solution1- HashMap+HashSet
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar){
                    return false;
                }
            }
            else{
                if(tSet.contains(tChar)){
                    return false;
                }
                sMap.put(sChar, tChar);
                tSet.add(tChar);
            }
        }
        return true;
    }
}

//Solution2- HashMap+HashMap
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar){
                    return false;
                }
            }
            else{
                sMap.put(sChar, tChar);
            }

            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar) != sChar){
                    return false;
                }
            }
            else{
                tMap.put(tChar, sChar);
            }
        }
        return true;
    }
}

//Solution3- Char Array
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] c = new char[256];
        char[] d = new char[256];

        // HashMap<Character, Character> sMap = new HashMap<>();
        // HashMap<Character, Character> tMap = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(c[s.charAt(i) - ' '] == 0){
                c[s.charAt(i) - ' '] = tChar;
            }
            else{
                if(c[s.charAt(i) - ' '] != tChar){
                    return false;
                }
            }

            if(d[t.charAt(i) - ' '] == 0){
                d[t.charAt(i) - ' '] = sChar;
            }
            else{
                if(d[t.charAt(i) - ' '] != sChar){
                    return false;
                }
            }
        }
        return true;
    }
}
