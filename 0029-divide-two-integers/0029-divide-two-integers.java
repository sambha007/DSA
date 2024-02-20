class Solution {
    public int divide(int dividend, int divisor) {
       /* int ans=0;
        if(dividend==-1&&divisor==-1)
        {
            ans=1;
        }
       else if(dividend<0&&divisor<0)
        {
             ans=dividend/divisor;
             ans=-1*-ans;
        }
        else
        {
              ans=dividend/divisor;
        }
       
        return ans;*/
        if(dividend==-2147483648 && divisor ==-1) return Integer.MAX_VALUE;
        int div=dividend/divisor;
       // System.out.println(div);
       // int m=Math.floor(div);
        return div;
    }
}