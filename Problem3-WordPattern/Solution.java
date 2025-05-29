// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

package Hashing-1.Problem3-WordPattern;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        //pattern length should match the number of words
        if(pattern.length() != words.length){
            return false;
        }

        HashMap<Character, String> hm = new HashMap<>();
        HashSet<String> hs = new HashSet<>();

        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            String word = words[i];

            if(hm.containsKey(c)){
                if(!(hm.get(c).equals(word))){
                    return false;
                }
            }
            else{
                if(hs.contains(word)){
                    return false;
                }
                hm.put(c, word);
                hs.add(word);
            }
        }
        return true;
    }
}
