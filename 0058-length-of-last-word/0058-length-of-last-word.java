class Solution {
    public int lengthOfLastWord(String s) {
        StringBuilder sb=new StringBuilder("");
        int flag=0;
        if(s.length()==1)
        {
            return 1;
        
        }
        if(s.charAt(0)== 'a' && s.charAt(1)==' ')
        {
            return 1;
        }
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            {
                sb.append(s.charAt(i));
                flag=1;
            }
            else if(flag==1 && s.charAt(i)==' ')
            {
                break;
            }
           
        }
        
       
        return sb.toString().length();
    }
}