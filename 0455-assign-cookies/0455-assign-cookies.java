import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int count = 0; // counter for satisfied children
         int j = 0; // pointer for cookies
        
        for (int i = 0; i < g.length; i++) { // loop over each child
            for (; j < s.length; j++) { // loop over cookies from the last position
                if (s[j] >= g[i]) { // if the cookie satisfies the child
                    count++; // increment satisfied count
                    j++; // move to the next cookie for the next child
                    break; // break to move to the next child
                }
            }
        }
        
        return count;
    }
}
