/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     Queue<Integer> q=new LinkedList<>();
    public boolean isValidBST(TreeNode root) {
          inorder(root);
        int arr[]=new int[q.size()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=q.poll();
        }
        for(int i=0;i<arr.length-1;i++)
        {
           if(arr[i]>=arr[i+1])
           return false;
        }
        return true;
    }
      public void inorder(TreeNode root)
    {
        if(root==null)
        
        return;
        inorder(root.left);
        q.add(root.val);
        inorder(root.right);
    }
}