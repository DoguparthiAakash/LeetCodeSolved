import java.math.*;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger c=new BigInteger(a,2);
        BigInteger d=new BigInteger(b,2);
        return c.add(d).toString(2);
    }
}