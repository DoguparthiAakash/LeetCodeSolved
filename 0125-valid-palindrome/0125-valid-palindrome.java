class Solution {
    public boolean isPalindrome(String s) {
    s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
    String b = new StringBuilder(s).reverse().toString();
       if(s.equals(b)){
            return true;
        }else{
            return false;
        } 
    }
}