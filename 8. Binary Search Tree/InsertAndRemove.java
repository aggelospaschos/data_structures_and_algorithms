// Definiton of TreeNode in Java
/*
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val; 
        left = null;
        right = null; 
    }
}
*/

public class InsertAndRemove {

    // Insert a new node and return the root of the BST.
    public TreeNode insert(TreeNode root, int value) {
    
        if (root == null) {
        
            return new TreeNode(value);
        }

        if (value > root.value) {
        
            root.right = insert(root.right, value);
        } else  if (value < root.value) {
        
            root.left = insert(root.left, value);
        }
        return root;
    }

    // Return the minimum value node of the BST.
    public TreeNode minValueNode(TreeNode root) {
    
        TreeNode current = root;
        while(current != null && current.left != null) {
        
            current = current.left;
        }
        return current;
    }

    // Remove a node and return the root of the BST.
    public TreeNode remove(TreeNode root, int value) {
    
        if (root == null) {
        
            return null;
        }
        if (value > root.value) {
        
            root.right = remove(root.right, value);
        } else if (value < root.value) {
        
            root.left = remove(root.left, value) ;
        } else {
        
            if (root.left == null) {
            
                return root.right;
            } else if (root.right == null) {
            
                return root.left;
            } else {
            
                TreeNode minNode = minValueNode(root.right);
                root.value = minNode.value;
                root.right = remove(root.right, minNode.value);
            }
        }
        return root;
    }    
}