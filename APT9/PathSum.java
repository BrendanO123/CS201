public class PathSum {
    public int hasPath(int target, TreeNode tree){
        if(tree == null){
            if(target == 0){return 1;}
            return 0;
        }
        boolean success = hasPath(target - tree.info, tree.left) != 0 || hasPath(target - tree.info, tree.right) != 0;
        if(success){return 1;}
        return 0;
    }
}
