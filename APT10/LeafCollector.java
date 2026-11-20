import java.util.ArrayList;

public class LeafCollector {
    private String getLayer(TreeNode tree, TreeNode parent){
        if(tree == null){return "";}
        if(tree.left == null && tree.right == null){
            if(parent != null){
                if(parent.left == tree){parent.left = null;}
                if(parent.right == tree){parent.right = null;}
            }
            return String.valueOf(tree.info);
        }
        return (getLayer(tree.left, tree) + " " + getLayer(tree.right, tree)).trim();
    }
    public String[] getLeaves(TreeNode tree) {
        if(tree == null){return null;}
        ArrayList<String> list = new ArrayList<>();
        while(tree.left != null || tree.right != null){
            list.add(getLayer(tree, null));
        }
        list.add(String.valueOf(tree.info));
        return list.toArray(new String[0]);
    }
}
