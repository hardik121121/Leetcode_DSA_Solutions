class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int arr2[] = new int[2*n];
        for(int i = 0; i < n; i++){
            arr2[i] = nums[i];
            arr2[i+n] = nums[i];
        }
        return arr2;
    }
}