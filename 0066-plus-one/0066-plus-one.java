class Solution {
    public int[] plusOne(int[] digits) {
      /*  long num=0;
        ArrayList<Integer>list=new ArrayList<>();
        int i=0;
        while(i<digits.length)
        {
            int temp=digits[i];
            num=num*10+temp;
            i++;
        }
        num=num+1;
        while(num>0)
        {
            long temp=num%10;
            list.add((int)temp);
            num=num/10;
        }
        Collections.reverse(list);
        int arr[]=new int[list.size()];
        for(int j=0;j<list.size();j++)
        {
            arr[j]=list.get(j); 
        }


        return arr;*/
        for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }
                digits[i] = 0;
            }

            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;
    }
}