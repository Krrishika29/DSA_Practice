class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int majority=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]==majority){
                count++;
            }
            else if(count==0){
                count++;
                majority=nums[i];
            }
            else{
                count--;
            }
        }
        return majority;
    }
}