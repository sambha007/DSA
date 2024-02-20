class Solution {
    public String reverseWords(String s) {
       /*  s = s.trim();
    StringBuilder sb = new StringBuilder();
    StringBuilder res = new StringBuilder();
    
    for (int i = s.length() - 1; i >= 0; i--) {
        if (s.charAt(i) == ' ') {
            res.append(sb.reverse());
            res.append(" ");
            sb.setLength(0); // Clear StringBuilder for the next word
        } else {
            sb.append(s.charAt(i));
        }
    }
    
    // Append the last word
    res.append(sb.reverse());

    return res.toString().trim();*/
      /*  s = s.trim();
        StringBuilder sb = new StringBuilder();
        StringBuilder res = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                res.append(sb.reverse());
                res.append(" ");
                sb.setLength(0); // Clear StringBuilder for the next word
            } else {
                sb.append(s.charAt(i));
            }
        }

        // Append the last word
        res.append(sb.reverse());

        return res.toString().trim();
        */
        String[] words = s.trim().split("\\s+"); // Split the input string by one or more spaces
        StringBuilder res = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]).append(" ");
        }

        return res.toString().trim();
        
    }
}