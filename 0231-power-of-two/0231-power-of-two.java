class Solution {
    public boolean isPowerOfTwo(int n) {
      /*  if(n<Integer.MAX_VALUE&&n>Integer.MIN_VALUE)
        {
           if(n==1)
           {
               return true;
           }
           else if(n%2==0)
           {
               return true;
           }
           else
           {
               return false;
           }
        }
        return false;
        */
        return n > 0 && (n & (n - 1)) == 0;
    }
}