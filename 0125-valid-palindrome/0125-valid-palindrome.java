class Solution {
    public boolean isPalindrome(String s) {
        s.trim();
        String ns=s.toLowerCase();
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<ns.length();i++)
        {
            if(ns.charAt(i)>='a'&&ns.charAt(i)<='z')
            {
                sb.append(ns.charAt(i));
            }
            if(ns.charAt(i)>='0'&&ns.charAt(i)<='9')
            {
                return false;
            }
        }
        String a=sb.toString();
        String b=sb.reverse().toString();
        System.out.println(a);
        System.out.println(b);
        
        
        if(a.equals(b))
        {
            return true;
        }
        return false;
    }
}