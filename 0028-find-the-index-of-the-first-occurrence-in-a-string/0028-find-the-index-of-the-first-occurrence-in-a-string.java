class Solution {
    public int strStr(String c, String b) {
        if(c.contains(b)){
           return c.indexOf(b);
        }
        else{
            return -1;
        }
    }
}