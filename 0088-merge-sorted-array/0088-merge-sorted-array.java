class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> arr3 = new ArrayList<>();
        for(int i = 0; i < m; i++){
            arr3.add(nums1[i]);
        }
         for(int i = 0; i < n; i++){
            arr3.add(nums2[i]);
        }
        Collections.sort(arr3);
        for(int i = 0; i < nums1.length; i++){
            nums1[i] = arr3.get(i);
        }

        
    }
}