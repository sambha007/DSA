class Solution {
    public int arraySign(int[] nums) {
        int tot=1;
        for(int i=0;i<nums.length;i++)
        {
            tot=tot*nums[i];
        }
        if(tot>0)
          return 1;
        else if(tot==0)
          return 0;
        else
          return -1;
        
    }
}