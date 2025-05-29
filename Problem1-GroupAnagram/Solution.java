// Time Complexity : O(n* k log k)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

package Hashing-1.Problem1-GroupAnagram;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();

        for(String str: strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String nString = new String(charArr);
            if(!hm.containsKey(nString)){
                hm.put(nString, new ArrayList<>());
            }
            hm.get(nString).add(str);
        }
        return new ArrayList<>(hm.values());
    }
}
