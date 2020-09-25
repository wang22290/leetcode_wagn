package 回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * created by wagn on 2020/9/18
 */
public class _46_全排列 {


    public static void main(String[] args) {

    }

    public static List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        if (len == 0){
            return  res;
        }

        boolean[] used = new boolean[len];
        List<Integer> path = new ArrayList<>();

        dfs(nums, len, 0, path, used, res);
        return res;

    }

    private static void  dfs(int[] nums, int len, int depth, List<Integer> path, boolean[] used, List<List<Integer>> res){
        if (depth == len){
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < len; i++) {
            if (!used[i]){
                path.add(nums[i]);
                used[i] = true;

                dfs(nums, len, depth + 1 , path, used, res);
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }



}
