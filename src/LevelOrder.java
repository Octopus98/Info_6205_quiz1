import java.util.*;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        int cur = 0;
        while(!queue.isEmpty()){
            List<Integer> levelRs = new ArrayList<Integer>();
            cur = queue.size();
            for(int i=0; i<cur; i++){
                TreeNode peek = queue.poll();
                levelRs.add(peek.val);
                if(peek.left!=null){
                    queue.offer(peek.left);
                }
                if(peek.right!=null){
                    queue.offer(peek.right);
                }
            }
            result.add(levelRs);
        }

        return result;
    }
}