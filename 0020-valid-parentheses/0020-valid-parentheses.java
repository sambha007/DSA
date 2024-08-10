class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        int flag=1;
        for(int i=0;i<s.length();i++)
        {
            stack.push(s.charAt(i));
        }
        for(int i=0;i<stack.size();i++)
        {
            char m=stack.pop();
            char n=stack.pop();
            if(m==')'&& n=='(')
            {
                flag=0;
            }
            else if(m=='}'&& n=='{')
            {
                flag=0;
            }
            else if(m==']'&& n=='[')
            {
                flag=0;
            }

        }
        if(flag==1)
        {
            return false;
        }
        return true;
    }
}