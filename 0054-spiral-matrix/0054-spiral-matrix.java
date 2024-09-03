class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int start=0;
        int end=0;
        int k=0;
        int p=0;
        int m=matrix.length;
        int n=matrix[0].length;
         List<Integer> res = new ArrayList<>();
 
        
        int a=n*m;
        if(m>=1&&n<=10)
        {
        while(k<a)
        {
            switch(p){
            case 0:
            { 
                int i=start,j=end;
                while(j<n)
                {
                    res.add(matrix[i][j]);
          
                    j++;
                     k++;
             
                }
                start++;
                p=1;
                break;
       
            }
            case 1:
            { 
                int i=start,j=n-1;
                while(i<m)
                {
                    res.add(matrix[i][j]);
                    k++;
                    i++;
                }
                p=2;
                n--;
                break;
            }
        
            case 2:
            {        
                int i=m-1,j=n-1;
                while(j>=end)
                {
                    res.add(matrix[i][j]);
                    k++;
                    j--;

                }
                m--;
                p=3;
                break;
            }
        
            case 3:
            {
                int i=m-1;
                int j=end;
        
                while(i>=start)
                {
                    res.add(matrix[i][j]);
                    k++;
                    i--;
                }
                end++;
                p=0;
                break;
            }
          }
       
            
        
        }
        }
    return res; 

    }
    
}