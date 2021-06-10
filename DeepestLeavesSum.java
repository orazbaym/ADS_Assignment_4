package com.company;
import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DeepestLeavesSum {
        public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode() {}
            TreeNode(int val) { this.val = val; }
            TreeNode(int val, TreeNode left, TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }
        public int deepestLeavesSum(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        int sum = 0;
        while(!qu.isEmpty()){
            int size = qu.size();
            int t = 0;
            boolean deepestLevel = true;
            for(int i = 0; i<size; i++){
                TreeNode head = qu.remove();
                if(head.right!=null){
                    deepestLevel = false;
                    qu.add(head.right);
                }
                if(head.left!=null){
                    deepestLevel = false;
                    qu.add(head.left);
                }
                if(deepestLevel) t+=head.val;
            }

            if(deepestLevel){
                sum = t;
            }
        }

            return sum;
        }
        public static void main(String[] args) {
        }
}

