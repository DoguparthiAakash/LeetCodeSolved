class Solution {
    public int lengthOfLastWord(String s) {
        s.replace("//s"," ");
        String b[]=s.split(" ");
        return b[b.length-1].length();
    }
}