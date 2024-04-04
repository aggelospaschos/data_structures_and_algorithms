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

import java.util.ArrayDeque;
import java.util.Deque;

public class BFS {
    
    public void bfs(TreeNode root) { 
    
        Deque<TreeNode> queue = new ArrayDeque<TreeNode>();
        if (root != null) {
        
            queue.add(root);
        }    
        int level = 0;
        while(!queue.isEmpty()) {
        
            System.out.print("level " + level + ": ");
            int levelLength = queue.size();
            for (int i = 0; i < levelLength; i++) {
            
                TreeNode current = queue.removeFirst(); 
                System.out.print(current.value + " ");
                if(current.left != null) {
                
                    queue.add(current.left);  
                }
                if(current.right != null) {
                
                    queue.add(current.right);
                }  
            }
            level++;
            System.out.println();
        }
        
    }
}