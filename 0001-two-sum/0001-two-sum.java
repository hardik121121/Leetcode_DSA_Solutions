class Solution {
    public int[] twoSum(int[] nums, int target) {
        int p1 = 0;
        int p2 = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]+nums[j]==target && j < nums.length){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}