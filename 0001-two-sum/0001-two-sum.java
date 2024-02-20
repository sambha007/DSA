class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*int m=0,n=0;
        for(int i=0;i<nums.length;i++)
        {
            
            for(int j=0;j<nums.length;j++)
            {
                int test=0;
                test=nums[i]+nums[j];
                if(test==target)
                {
                   // System.out.pri
                   m=i;
                   n=j;
                   
                }

            }
        }
    }  
    return new int[]{0,0};*/
    HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{0,0};
    }
}