package from_1_to_200;

import tool.TreeNode;

import java.util.*;

public class LeetCode_156 {
    public static void main(String[] args) {
        TreeNode node01 = new TreeNode(1);
        TreeNode node02 = new TreeNode(2);
        TreeNode node03 = new TreeNode(3);
        TreeNode node04 = new TreeNode(4);
        TreeNode node05 = new TreeNode(5);
        node01.setLeft(node02);
        node02.setLeft(node04);
        node02.setRight(node05);
        node01.setRight(node03);
        List<TreeNode> res = order(node01);
        System.out.println(res);
        System.out.println(order(upsideDownBinaryTree01(node01)));
    }

    public static TreeNode upsideDownBinaryTree01(TreeNode root) {
        if (root == null || root.getLeft() == null) {
            return root;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (temp != null) {
            stack.push(temp);
            temp = temp.getLeft();
        }
        TreeNode newRoot = stack.pop();
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            TreeNode left = node.getLeft(), right = node.getRight();
            left.setLeft(right);
            left.setRight(node);
            node.setLeft(null);
            node.setRight(null);
        }
        return newRoot;
    }

    public static List<TreeNode> order(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<TreeNode> res = new ArrayList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                res.add(node);
                if (node.getLeft() != null) {
                    queue.offer(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.offer(node.getRight());
                }
            }
        }
        return res;
    }
}


