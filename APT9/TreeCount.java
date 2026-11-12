import java.util.LinkedList;
import java.util.Queue;

public class TreeCount {
    public int count(TreeNode tree) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(tree);
        int count = 0;
        while(!queue.isEmpty()){
            TreeNode current = queue.remove();
            if(current == null){continue;}
            queue.add(current.left);
            queue.add(current.right);
            count++;
        }
        return count;
    }
}
