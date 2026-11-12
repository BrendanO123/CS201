import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SortedLeaves {
    public String[] values(TreeNode tree) {
        int[] letterCounts = new int[26];
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(tree);
        while(!queue.isEmpty()){
            TreeNode current = queue.remove();
            if(current == null){continue;}
            if(current.left == null && current.right == null){
                letterCounts[current.info - 65]++;
                continue;
            }
            queue.add(current.left);
            queue.add(current.right);
        }
        ArrayList<String> ret = new ArrayList<>();
        for(int i = 0; i < 26; i++){
            for(int j = 0; j < letterCounts[i]; j++){
                ret.add(Character.toString((char) ('A' + i)));
            }
        }
        return ret.toArray(new String[0]);
    }
}
