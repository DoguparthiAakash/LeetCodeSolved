class Solution {
  public int lengthOfLongestSubstring(String s) {
    int a = 0;
    int j = -1;
    int[] arr = new int[128];
    Arrays.fill(arr, -1);
    for (int i = 0; i < s.length(); ++i) {
      j = Math.max(j, arr[s.charAt(i)]);
      a = Math.max(a, i - j);
      arr[s.charAt(i)] = i;
    }
    return a;
  }
}