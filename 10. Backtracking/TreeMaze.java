import java.util.ArrayList;

// Definition of TreeNode:
// public class TreeNode {
//
//     int value;
//     TreeNode left;
//     TreeNode right;
//
//     public TreeNode(int value) {
//         this.value = value;
//         this.left= null;
//         this.right = null;
//     }
// }

public class TreeMaze {
    
    public boolean canReachLeaf(TreeNode root) {
    
        if (root == null || root.value == 0) {
        
            return false;
        } 
        if (root.left == null && root.right == null) {
        
            return true;
        }
        if (canReachLeaf(root.left)) {
        
            return true;
        }
        if (canReachLeaf(root.right)) {
        
            return true;
        }
        return false;
    }

    public boolean leafPath(TreeNode root, ArrayList<Integer> path) {
    
        if (root == null || root.value == 0) {
        
            return false;
        }
        path.add(root.value);

        if (root.left == null && root.right == null) {
        
            return true;
        }
        if (leafPath(root.left, path)) {
        
            return true;
        }
        if (leafPath(root.right, path)) {
        
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

}