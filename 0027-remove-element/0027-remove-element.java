class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
             if(nums[i]==val)
             {
                 count++;
                 
             }
             if(nums[i]!=val)
             {
                 list.add(nums[i]);
             }
        }
        for(int j=0;j<list.size();j++)
        {
            nums[j]=list.get(j);
        }
        return list.size();
    }
}