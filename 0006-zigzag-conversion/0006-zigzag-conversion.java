class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)
        return s;
        String arr[]=new String[numRows];
        int i=0,k=0;
        for(int j=0;j<arr.length;j++)
        arr[j]="";
        boolean down=true;
        while(i<s.length())
        {
           
            if(k==numRows)
            {
                down=false;
                k=k-2;

            }
            if(k==0)
            {
                down=true;
            }
            if(down)
            {
            arr[k]+=s.charAt(i);
            i++;
            k++;
            }
            else
            {
                arr[k]+=s.charAt(i);
                i++;
                k--;
            }
           
        }
         String ans="";
        for(int j=0;j<arr.length;j++)
        {
            ans+=arr[j];
        }
        return ans;
    }
}