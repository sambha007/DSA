class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxsum=0;
        int temp=0;
        for(int i=0;i<accounts.length;i++)
        {
           for(int j=0;j<accounts[i].length;j++)
           {
               temp+=accounts[i][j];
               if(temp>=maxsum)
               {
                 maxsum=temp;
                 
               }
           }
           temp=0;
        }
        return maxsum;
    }
}