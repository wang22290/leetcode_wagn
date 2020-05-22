package 二叉树;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 559. N叉树的最大深度
 * https://leetcode-cn.com/problems/maximum-depth-of-n-ary-tree/
 * created by wagn on 2020/5/22
 */
public class _559_N叉树的最大深度 {

//    public int maxDepth(Node root) {
//        if (root == null)return 0;
//        int submax = 0;
//        for (Node subNode :root.children){
//            int temp = maxDepth(subNode);
//            submax = Math.max(submax,temp);
//
//        }
//        return submax + 1;
//    }


    public int maxDepth(Node root) {
        if (root == null)return 0;
        int height = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            Node node = queue.poll();
            levelSize --;
            for (Node temp : node.children) {
                if (temp != null){
                    queue.offer(temp);
                }
            }
            if (levelSize == 0){
                levelSize = queue.size();
                height ++;
            }
        }
        return height;
    }

//    public int maxDepth(Node root) {
//        int height = 0;
//        if (root == null) return 0;
//        Queue<Node> queue = new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()){
//           int leveal = queue.size();
//           height++;
//           while (leveal > 0){
//               leveal--;
//               Node node = queue.poll();
//               for (Node temp :node.children) {
//                   if (temp != null){
//                       queue.add(temp);
//                   }
//               }
//           }
//        }
//        return height;
//    }
}

