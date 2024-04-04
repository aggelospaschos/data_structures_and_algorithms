// Definiton of TreeNode in Java
/*
public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value; 
        left = null;
        right = null; 
    }
}
*/

public class DFS {
    
    public void inorder(TreeNode root) {

        if (root == null) {

            return;
        }
        inorder(root.left);
        System.out.println(root.value);
        inorder(root.right);
    }

    public void preorder(TreeNode root) {

        if (root == null) {

            return;
        }
        System.out.println(root.value);
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(TreeNode root) {

        if (root == null) {
            
            return;
        }  
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.value);
    }
    
}