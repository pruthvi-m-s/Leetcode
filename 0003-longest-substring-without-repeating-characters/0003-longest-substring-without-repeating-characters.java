class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int maxLength=0;
        HashSet<Character> res=new HashSet<>();
        for(int r=0;r<s.length();r++){
            while(res.contains(s.charAt(r))){
                res.remove(s.charAt(l));
                l++;
            }
            res.add(s.charAt(r));
            maxLength=Math.max(maxLength,(r-l+1));
        }
        return maxLength;
    }
}