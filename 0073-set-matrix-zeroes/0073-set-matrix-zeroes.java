class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean vis[][]=new boolean[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0&&vis[i][j]==false)
                {
                    vis[i][j]=true;
                    change(i,j,vis,matrix);
                }
            }
        }
    }
    public void change(int m,int n,boolean vis[][],int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
             if(vis[i][n]==false&&arr[i][n]!=0)
             {
            arr[i][n]=0;
            vis[i][n]=true;
             }
        }
        for(int j=0;j<arr[0].length;j++)
        {
            if(vis[m][j]==false&&arr[m][j]!=0)
            {arr[m][j]=0;
            vis[m][j]=true;
            }
        }
    }
}