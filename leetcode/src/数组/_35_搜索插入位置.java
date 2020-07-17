package 数组;

/**
 * 35. 搜索插入位置
 * https://leetcode-cn.com/problems/search-insert-position/
 * created by wagn on 2020/7/17
 */
public class _35_搜索插入位置 {

    public int searchInsert(int[] nums, int target) {

        int startIndex = 0;
        //尾索引
        int endIndex   = nums.length;
        if (endIndex == 0){
            return 0;
        }
        if (nums[endIndex-1] < target){
            return endIndex;
        }

        //target 索引
        int currentIndex ;
        endIndex = endIndex -1;
        while (startIndex < endIndex){
            currentIndex = startIndex + (endIndex - startIndex)/2;
            if (nums[currentIndex] < target){
                startIndex = currentIndex + 1;
            }else {
                endIndex = currentIndex;
            }
        }
        return startIndex;

    }

}
