class Solution {
    public int maxArea(int[] height) {
        int maxi=0;
        int lp=0;
        int rp=height.length-1;
        while(lp<rp)
        {
            int ht=Math.min(height[lp],height[rp]);
            int w=rp-lp;
            int c=ht*w;
            maxi=Math.max(maxi,c);
            if(height[lp]<height[rp])
            {
                lp++;
            }
            else
            {
                rp--;
            }
        }
      return maxi;
/*
        for(int i=0;i<height.length;i++)
        {
            for(int j=i+1;j<height.length;j++)
            {
                int ht=Math.min(height[i],height[j]);
                int w=j-i;
                int c=ht*w;
                maxi=Math.max(maxi,c);

            }
        }
        return maxi;
    */

    }
}