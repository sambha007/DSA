class Solution {
    public int searchInsert(int[] nums, int target) {
        int cout=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<target)
            {
                cout++;
            }
            
        }
        return cout;
    }
}