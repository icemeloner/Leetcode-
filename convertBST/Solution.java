package Leetcode.convertBST;

import java.util.ArrayList;

public class Solution
/**
 * 给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，
 * 使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
 */
{   int num = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root==null) return null;
       convertBST(root.right);
       root.val += num;
       num = root.val;
       convertBST(root.left);
       return root;
    }

}

