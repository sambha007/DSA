class Solution {
    public int majorityElement(int[] nums) {
        int ans=0;
        int mcount=0;
        if(nums.length==1)
        {
            return 1;
        }
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
            if(mcount<count)
            {
                ans=nums[i];
                mcount=count;
            }
            
        }
        return ans;
    }
}