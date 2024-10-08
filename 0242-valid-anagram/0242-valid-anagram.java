class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        else
        {
            StringBuilder sb=new StringBuilder(s);
            for(int i=0;i<t.length();i++)
            {
                for(int j=0;j<sb.length();j++)
                {
                    if(sb.charAt(j)==t.charAt(i))
                    {
                        sb.deleteCharAt(j);
                        break;
                    }
                }
            }
            if(sb.length()!=0)
            {
                return false;
            }
            return true;
        }
        
    }
}