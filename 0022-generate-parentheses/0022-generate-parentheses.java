class Solution {
    List<String> al=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        generate(n,0,0,"");
        return al;
    }
    public void generate(int n,int c,int o,String ans)
    {
        if(c==n&&o==n)
        {
            al.add(ans);
            return;
        }
        if(o<c||c>n||o>n)
        return;
        generate(n,c,o+1,ans+"(");
        generate(n,c+1,o,ans+")");
    }
}