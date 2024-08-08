class Solution {
     String[] belowtwnty={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    String[] tens={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    String[] thousands={"","Thousand","Million","Billion"};
    public String numberToWords(int num) {
        if(num==0)
        return "Zero";
    String ans="";
    int i=0;
    while(num>0)
    {
        if(num%1000!=0)
        ans=calculate(num%1000)+thousands[i]+" "+ans;
        num/=1000;
        i++;
    }
    return ans.trim();
    }
    public String calculate(int n)
    {
        if(n==0)
        return "";
        if(n<20)
        {
            return belowtwnty[n]+" ";
        }
        else
        {
            if(n<100)
            return tens[n/10]+" "+calculate(n%10);
            else
            return belowtwnty[n/100]+" "+"Hundred "+calculate(n%100);
        }


    }
    
}