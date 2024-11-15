class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> arr3 = new ArrayList<>();
        int i = 0, j = 0;
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                arr3.add(nums1[i]);
                i++;
            }else{
                arr3.add(nums2[j]);
                j++;
            }
        }
        //1 out of the 2 arrays will have some remaining elements:
        while(i < m){
            arr3.add(nums1[i]);
            i++;
        }
        while(j < n){
            arr3.add(nums2[j]);
            j++;
        }
     
        // Collections.sort(arr3);
        for(int k = 0; k < nums1.length; k++){
            nums1[k] = arr3.get(k);
        }  
    }
}