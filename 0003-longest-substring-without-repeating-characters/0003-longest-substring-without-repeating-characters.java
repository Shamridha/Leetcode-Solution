class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=longestSubString(s,"",0);
        System.out.println(ans);

        return ans;
    }
    public int longestSubString(String s,String ans,int max)
    {

        if(s.length()==0)
        {
            if(ans.length()>max)
            max=ans.length();
        return max;
        }
        String ch=s.substring(0,1);
        if(ans.contains(ch))
        {
            if(max<ans.length())
            max=ans.length();
            ans=ans.substring(ans.indexOf(ch)+1);
            
        }
        max= longestSubString(s.substring(1),ans+ch,max);
        
        return max;
    }
}