class Solution {
    public int removeElement(int[] nums, int val) {
        int b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[b++]=nums[i];
            }
        }
    return b;}
}