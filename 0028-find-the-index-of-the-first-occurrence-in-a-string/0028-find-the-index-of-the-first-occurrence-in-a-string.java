import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Solution {
    public int strStr(String haystack, String needle) {
       
       Pattern pt=Pattern.compile(needle);
       Matcher mc=pt.matcher(haystack);
       int ans=-1;
       while(mc.find())
       {
        System.out.println(mc.start());
        ans=mc.start();
        break;
       }
       return ans;
    }
}