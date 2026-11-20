import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class LeafTrails {
    class pathNodePair{
        StringBuilder path;
        TreeNode node;
    }
    public String[] trails(TreeNode tree) {
        TreeMap<Integer, String> sortedPaths = new TreeMap<>();
        TreeMap<String, TreeNode> map = new TreeMap<>();
        Queue<String> queue = new LinkedList<>();
        map.put("", tree);
        queue.add("");
        while(!queue.isEmpty()){
            String currentPath = queue.remove();
            TreeNode currentNode = map.get(currentPath);
            if(currentNode == null){continue;}
            if(currentNode.left == null && currentNode.right == null){
                sortedPaths.put(currentNode.info, currentPath);
                continue;
            }
            queue.add(currentPath + "0"); map.put(currentPath + "0", currentNode.left);
            queue.add(currentPath + "1"); map.put(currentPath + "1", currentNode.right);
        }
        String[] ret = new String[sortedPaths.size()];
        int index = -1;
        for(String str : sortedPaths.values()){
            ret[++index] = str;
        }
        return ret;
    }
}
