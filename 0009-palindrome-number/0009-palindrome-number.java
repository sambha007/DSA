class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int sol=0;
        while(x>0)
        {
            int temp=x%10;
            sol=sol*10+temp;
            x=x/10;
            
        }
        if(sol==num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}