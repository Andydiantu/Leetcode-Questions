import com.sun.source.tree.Tree;

public class Solution {
    public TreeNode bstFromPreorder(int[] preorder){

        TreeNode root = new TreeNode(preorder[0]);

        for (int i = 1; i < preorder.length; i++){
            addNewNode(root,preorder[i]);
        }

        return root;
    }

    public  void addNewNode(TreeNode root, int newVal){
        if (root.val > newVal){
            if (root.left == null) {
                root.left = new TreeNode(newVal);
            } else {
                addNewNode(root.left, newVal);
            }
        } else {
            if (root.right == null) {
                root.right = new TreeNode(newVal);
            } else {
                addNewNode(root.right, newVal);
            }
        }
    }
}
