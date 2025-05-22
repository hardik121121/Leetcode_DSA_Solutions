class Solution {
    public boolean isPalindrome(int x) {
        int originalNo = x;
        int reverse = 0;
        if(x<0){
            return false;
        }
        while(x!=0){
            int lastDigit = x%10;
            reverse = reverse*10+lastDigit;
            x=x/10;
        }
        if(reverse!=originalNo){
            return false;
        }
        return true;
    }
}