public class LevelCount {
    public int count(TreeNode t, int level) {
        if(t == null){return 0;}
        int afterMe = count(t.left, level - 1) + count(t.right, level - 1);
        if(level == 0){afterMe += 1;}
        return afterMe;
    }
}
