package 数组;

/**
 * 33. 搜索旋转排序数组
 * https://leetcode-cn.com/problems/search-in-rotated-sorted-array/
 * created by wagn on 2020/4/27
 */
public class _33_搜索旋转排序数组 {

    public static void main(String[] args) {
        int[] nums = new int[]{4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,0,1,2,3,};
        search(nums,10);

    }


    public static int search(int[] nums, int target) {
        if (nums.length == 0 || nums == null)return  -1;
        //标记索引
        //头索引
        int startIndex = 0;
        //尾索引
        int endIndex   = nums.length -1;
        //target 索引
        int currentIndex ;
        while (startIndex <= endIndex){
            currentIndex = startIndex + (endIndex -startIndex)/2;
            System.out.println(currentIndex+"-------currentIndex");
            if (nums[currentIndex] == target){
                return currentIndex;
            }
            //前半部分有序，
            if (nums[startIndex] <= nums[currentIndex]){
                //target在前半部分
                if (target >= nums[startIndex] && target < nums[currentIndex]){
                    endIndex = currentIndex -1;
                    System.out.println(nums[endIndex]+"-------1");
                } //target在后半部分
                else {
                    startIndex = currentIndex + 1;
                    System.out.println(nums[startIndex]+"-------2");
                }
            }else {
                if (target <= nums[endIndex] && target >nums[currentIndex]){
                    startIndex = currentIndex +1;
                    System.out.println(nums[startIndex]+"-------3");
                }else {
                    endIndex = currentIndex -1;
                    System.out.println(nums[endIndex]+"-------4");
                }
            }
        }

        return -1;
    }




}
