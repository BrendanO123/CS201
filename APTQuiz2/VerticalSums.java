import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalSums {
    private class NodeColumnNumberPair{
        public TreeNode node;
        public int column;
        public NodeColumnNumberPair(TreeNode node, int column){
            this.node = node;
            this.column = column;
        }
    }
    public int[] sums(TreeNode tree) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<NodeColumnNumberPair> queue = new LinkedList<>();
        queue.add(new NodeColumnNumberPair(tree, 0));
        while(!queue.isEmpty()){
            NodeColumnNumberPair current = queue.remove();
            if(current.node == null){continue;}
            map.put(current.column, map.getOrDefault(current.column, 0) + current.node.info);
            queue.add(new NodeColumnNumberPair(current.node.left, current.column - 1));
            queue.add(new NodeColumnNumberPair(current.node.right, current.column + 1));
        }
        int[] ret = new int[map.size()];
        int index = 0;
        for(int key : map.keySet()){
            ret[index++] = map.get(key);
        }
        return ret;
    }
}
