package 图;

import java.util.Arrays;

/**
 * 785. 判断二分图
 * https://leetcode-cn.com/problems/is-graph-bipartite/
 * created by wagn on 2020/7/16
 * 二分图
 * 如果我们能将一个图的节点集合分割成两个独立的子集A和B，并使图中的每一条边的两个节点一个来自A集合，一个来自B集合，我们就将这个图称为二分图。
 */
public class _785_判断二分图 {

    private static final int UNCOLORED = 0;
    private static final int RED = 1;
    private static final int GREEN = 2;
    private int[] color;
    private boolean valid;
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        valid = true;
        color = new int[n];
        Arrays.fill(color,UNCOLORED);
        for (int i = 0; i < n && valid ; i++) {
            if (color[i] == UNCOLORED){
                dfs(i,RED,graph);
            }
        }
        return true;
    }

    public void dfs(int node,int c,int[][] graph){
        color[node] = c;
        int cNei = c == RED? GREEN:RED;
        for (int neighbor:graph[node]) {
            if (color[neighbor] == UNCOLORED){
                dfs(neighbor,cNei,graph);
                if (!valid){
                    return;
                }
            }else if (color[neighbor] != cNei){
                valid = false;
                return;
            }
        }
    }
}

//class Solution {
//    private static final int UNCOLORED = 0;
//    private static final int RED = 1;
//    private static final int GREEN = 2;
//    private int[] color;
//    private boolean valid;
//
//    public boolean isBipartite(int[][] graph) {
//        int n = graph.length;
//        valid = true;
//        color = new int[n];
//        Arrays.fill(color, UNCOLORED);
//        for (int i = 0; i < n && valid; ++i) {
//            if (color[i] == UNCOLORED) {
//                dfs(i, RED, graph);
//            }
//        }
//        return valid;
//    }
//
//    public void dfs(int node, int c, int[][] graph) {
//        color[node] = c;
//        int cNei = c == RED ? GREEN : RED;
//        for (int neighbor : graph[node]) {
//            if (color[neighbor] == UNCOLORED) {
//                dfs(neighbor, cNei, graph);
//                if (!valid) {
//                    return;
//                }
//            } else if (color[neighbor] != cNei) {
//                valid = false;
//                return;
//            }
//        }
//    }
//}
//
