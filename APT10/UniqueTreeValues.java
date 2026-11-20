import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;
public class UniqueTreeValues {
    public int[] unique(TreeNode root) {
        TreeSet<Integer> set = new TreeSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode current = queue.remove();
            if(current == null){continue;}
            queue.add(current.left);
            queue.add(current.right);
            set.add(current.info);
        }
        int[] ret = new int[set.size()];
        int index = -1;
        for(Integer i : set){ret[++index] = i;}
        return ret;
    }
}
