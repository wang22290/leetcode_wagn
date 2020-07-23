package 动态规划;

/**
 * 64. 最小路径和
 * https://leetcode-cn.com/problems/minimum-path-sum/
 * created by wagn on 2020/7/23
 */
public class _64_最小路径和 {

    public static void main(String[] args) {
int[][] grid = {{1,3,1},
        {1,5,1},
        {4,2,1}
};

        System.out.println(minPathSum(grid));
//        System.out.println(minPathSum2(grid));
    }

    public static int minPathSum(int[][] grid) {
//            grid.length 标示这个网格的高度
        for (int i = 0; i < grid.length; i++) {
//            grid[0].length 标示这个网格的宽度
            for (int j = 0; j < grid[0].length; j++) {

                if (i == 0 && j== 0){
                    continue;
                } else if (i == 0){
                    grid[i][j] = grid[i][j-1] + grid[i][j];
                }else if (j == 0){
                    grid[i][j] = grid[i -1][j] + grid[i][j];
                }else {
                    grid[i][j] = Math.min(grid[i-1][j] , grid[i][j-1]) + grid[i][j];
                }
//                System.out.print("--"+ grid[i][j-1]+"----"+grid[i][j]+"----"+grid[i -1][j]);
            }
        }
        return grid[grid.length -1][grid[0].length -1];

    }


    public static int minPathSum2(int[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(i == 0 && j == 0) continue;
                else if(i == 0)  grid[i][j] = grid[i][j - 1] + grid[i][j];
                else if(j == 0)  grid[i][j] = grid[i - 1][j] + grid[i][j];
                else grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }



        public int minPathSum3(int[][] grid) {
            int row = grid.length;
            int col = grid[0].length;

            int[] mark = new int[col];
            mark[col-1] = grid[row-1][col-1];
            for(int i = col-2; i >= 0; i--){
                mark[i] = mark[i+1] + grid[row-1][i];
            }

            helper(mark, grid, row-2);
            return mark[0];
        }

        public void helper(int[] mark, int[][] grid, int row){
            if(row < 0){
                return;
            }
            int len = mark.length;
            mark[len-1] += grid[row][len-1];
            for(int j = len-2; j >= 0; j--){
                mark[j] = grid[row][j] + Math.min(mark[j+1], mark[j]);
            }
            helper(mark, grid, row-1);
        }

}

