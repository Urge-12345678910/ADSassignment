package assign_2;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
public class Task_6 {
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean validate(TreeNode node, long min, long max) {
        if (node == null) {
            return true;
        }
        if (node.val <= min || node.val >= max) {
            return false;
        }
        return validate(node.left, min, node.val) &&
                validate(node.right, node.val, max);
    }
    public static void main(String[] args) {
        Task_6 solution = new Task_6();
        TreeNode root1 = new TreeNode(10);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(15);
        System.out.println("Is Tree 1 valid? " + solution.isValidBST(root1));
        TreeNode root2 = new TreeNode(10);
        root2.left = new TreeNode(5);
        root2.right = new TreeNode(15);
        root2.right.left = new TreeNode(6);
        System.out.println("Is Tree 2 valid? " + solution.isValidBST(root2));
    }
}
