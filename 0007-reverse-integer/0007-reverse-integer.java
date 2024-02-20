class Solution {
    public int reverse(int x) {
        long res=0;
        int n=x;
        if(x>Integer.MAX_VALUE)
        {
            return 0;
        }
         if(x<0)
        { 
           n=n*-1;
           while(n>0)
           {
            int temp=n%10;
            res=res*10+temp;
            n=n/10;
         }
         if(res>=Integer.MAX_VALUE)
         {
             return 0;
         }
        return -(int)res;
        }
        while(n>0)
        {
            int temp=n%10;
            res=res*10+temp;
            n=n/10;
        }
        if(res>=Integer.MAX_VALUE)
         {
             return 0;
         }
       
        return (int)res;
        
    }
}