
import java.util.PriorityQueue;

public class AllPaths {
    int pathCompare(String a, String b){
        String[] aArr = a.split("->");
        String[] bArr = b.split("->");
        int [] aIntArr = new int[aArr.length];
        int [] bIntArr = new int[bArr.length];
        for(int i = 0; i < aArr.length; i++){aIntArr[i] = Integer.valueOf(aArr[i]);}
        for(int i = 0; i < bArr.length; i++){bIntArr[i] = Integer.valueOf(bArr[i]);}
        for(int i = 0; i < Math.min(aIntArr.length, bIntArr.length); i++){
            if(aIntArr[i] != bIntArr[i]){return aIntArr[i] - bIntArr[i];}
        }
        return aIntArr.length - bIntArr.length;
    }
    PriorityQueue<String> returnList = new PriorityQueue<String>(this::pathCompare);
    private void helper(TreeNode t, String path){
        if(t.left == null && t.right == null){returnList.add(path);}
        if(t.left!=null){helper(t.left, path + "->" + t.left.info);}
        if(t.right!= null){helper(t.right, path + "->" + t.right.info);}
    }
    public String[] paths(TreeNode t) {
        if(t == null){return new String[0];}
        returnList = new PriorityQueue<>();
        helper(t, String.valueOf(t.info));
        return returnList.toArray(new String[0]);
    }
}
