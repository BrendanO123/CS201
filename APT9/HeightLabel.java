import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class HeightLabel {
    public TreeNode rewire(TreeNode t) {
        Stack<TreeNode> stack = new Stack<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(t);
        while(!queue.isEmpty()){
            TreeNode current = queue.remove();
            if(current == null){continue;}
            queue.add(current.left);
            queue.add(current.right);
            stack.add(current);
        }
        while(!stack.isEmpty()){
            TreeNode current = stack.removeLast();
            if(current == null){continue;}
            int left = (current.left == null ? 0 : current.left.info);
            int right = (current.right == null ? 0 : current.right.info);
            current.info = Math.max(left, right) + 1;
        }
        return t;
    }
}
