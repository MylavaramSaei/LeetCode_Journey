import java.util.*;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            // Process nodes at the current level
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                currentLevel.add(current.val);

                // Add child nodes to queue for the next level
                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }

            result.add(currentLevel);
        }

        return result;
    }
}
