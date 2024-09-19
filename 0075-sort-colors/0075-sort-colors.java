class Solution {
    public void sortColors(int[] nums) {
        int countZero=0;
        int countOne=0;
        int countTwo=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            countZero++;
            else if(nums[i]==1)
            countOne++;
            else
            countTwo++;
        }
        int ind=0;
        if(countZero!=0)
        {
          while(countZero>0)
          {
            nums[ind]=0; 
            ind++;
            countZero--;
          } 
        }
        if(countOne!=0)
        {
            while(countOne>0)
            {
                nums[ind]=1;
                ind++;
                countOne--;
            }
        }
         if(countTwo!=0)
        {
            while(countTwo>0)
            {
                nums[ind]=2;
                ind++;
                countTwo--;
            }
        }
    }
}