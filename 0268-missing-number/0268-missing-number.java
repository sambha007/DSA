class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
       // int res=0;
        //Collection.sort(nums);
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
           if(nums[i]!=i)
           {
               return i;
             
           }
        }
        return n;
    }
}