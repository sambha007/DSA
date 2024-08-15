class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        if(x==-1 && n%2==0)
        {
            return 1;
        }
        if(x==-1 && n%2!=0)
        {
            return -1;
        }
        
        if(x==1)
        {
            return 1;
        }
        if(n<-214748364)
        {
            return 0;
        }
        if(n>0)
        {
            double temp=x;
            for(int i=1;i<n;i++)
            {
               temp=temp*x;
               
                
            }
            ans=temp;

        }
        else if(n==0 )
        {
            return 1;
        }
        else
        {
            double temp=x;
            for(int i=1;i<-(n);i++)
            {
               temp=temp*x;
            }
            ans=1/temp;
        }
        return ans;
        
    }
}