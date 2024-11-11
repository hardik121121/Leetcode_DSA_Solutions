class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int ans = 0;
        int window = 0;
        char[] arr = s.toCharArray();
        for(int i = 0; i < k; i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
            window++;
        }
        ans = window;
        for(int right = k; right < arr.length; right++){
             if(arr[right - k] == 'a' || arr[right - k] == 'e' || arr[right - k] == 'i' || arr[right- k] == 'o' || arr[right - k] == 'u'){
             window--;
             }
            
            if(arr[right] == 'a' || arr[right] == 'e' || arr[right] == 'i' || arr[right] == 'o' || arr[right] == 'u'){
             window++;
             ans = Math.max(ans,window);
            }
          
        }
          return ans;
    }
}