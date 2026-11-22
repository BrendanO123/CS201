import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class TreeDistinct {
    public int distinct(TreeNode tree) {
        HashSet<Integer> set = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(tree);
        while(!queue.isEmpty()){
            TreeNode current = queue.remove();
            if(current == null){continue;}
            set.add(current.info);
            queue.add(current.left);
            queue.add(current.right);
        }
        return set.size();
    }
}
