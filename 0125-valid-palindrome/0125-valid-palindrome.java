class Solution {
    public boolean isPalindrome(String s) {
        String lows = s.toLowerCase();
        String news= lows.replaceAll("[^a-z0-9]","");
        int left =0, right=news.length()-1;
        while(left<right){
            if(news.charAt(left)!=news.charAt(right)){
                return false;
            }
            left ++;
            right--;

        }
        return true;
    }
}