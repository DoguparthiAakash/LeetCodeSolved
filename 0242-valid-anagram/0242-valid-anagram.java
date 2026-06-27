class Solution {
    public boolean isAnagram(String s, String t) {
        char []b=s.toCharArray();
        char []c=t.toCharArray();
        Arrays.sort(b);
        Arrays.sort(c);
        if (s.length() != t.length()){
            return false;}
        if(Arrays.equals(b,c)){
            return true;
        }
        return false;
        
    }
}