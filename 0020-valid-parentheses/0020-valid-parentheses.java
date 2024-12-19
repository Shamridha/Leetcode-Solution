class Solution {
    public boolean isValid(String s) {
       
      
     
       char []ch=s.toCharArray();
       char []ch1=new char[ch.length];
        int i=0;
        int a=0;
        int b=0;
        int c=0;
        if(ch.length%2==1)
        return false;
        int top=0;
        while(i<s.length())
        {
           ch1[top++]=ch[i++];
            switch(ch1[top-1])
            {
                case '(':
                {a++;
                    break;
                    }
                case '[':
                {
                    b++;
                    break;
                }
                case '{':
                {
                    c++;
                    break;
                }
                case ')':
                {
                    if(a!=0)
                    {
                        if(ch1[top-2]=='(')
                        top-=2;
                        a--;
                    }
                    break;
                }
                case ']':
                {
                    if(b!=0)
                    {
                        if(ch1[top-2]=='[')
                        top-=2;
                        b--;
                    }
                    break;
                }
                case '}':
                {
                    if(c!=0)
                    {
                        if(ch1[top-2]=='{')
                        top-=2;
                        c--;
                    }
                    break;
                }
            }
        }
  if(top==0)
  return true;
  
  return false;
    }
}
