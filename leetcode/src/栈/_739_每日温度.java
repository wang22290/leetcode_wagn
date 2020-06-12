package 栈;

/**
 * created by wagn on 2020/6/11
 */
public class _739_每日温度 {

    public static void main(String[] args) {
        int[] nums = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(dailyTemperatures(nums));
    }

    public static int[] dailyTemperatures(int[] T) {
        int[] numbers = new int[T.length];
        for (int i = T.length -2; i >= 0 ; i--) {
            for (int j = i + 1; j <T.length ; j += numbers[j]) {
                System.out.println(numbers[j]);
                if (T[j] > T[i]){
                    numbers[i] = j -i;
                    break;
                }else if (numbers[j] == 0){
                    numbers[i] = 0;
                    break;
                }
            }
        }
        return numbers;
    }
//    public static int[] dailyTemperatures(int[] T) {
//        int[] numbers = new int[T.length];
//
//        for (int i = 0; i < T.length; i++) {
//            int current = T[i];
//                for (int j = i+ 1; j < T.length ; j++) {
//                    int next = T[j];
//                    if (current < next){
//                        numbers[i] = j - i;
//                        break;
//                    }
//                }
//        }
//        return numbers;
//    }



        public int[] dailyTemperatures55(final int[] T) {
            if (T.length <= 0) {
                return T;
            }
            final int[] ascending = new int[T.length]; // 维护一个上升序列，离当前位置最近的、大于当前元素所有元素集合
            final int[] result = new int[T.length];
            int ascIndex = T.length - 1;
            ascending[ascIndex] = ascIndex;
            result[ascIndex] = 0;
            for (int i = T.length - 2; i >= 0; i--) { // 从后往前遍历
                final int temp = T[i];
//            if (temp < T[i + 1]) { // 特殊情况加速
//                result[i] = 1;
//            } else {
                int left = ascIndex;
                ascIndex = T.length;
                while (left < ascIndex) { // 二分搜索，找到比target大的最小元素
                    final int mid = (left + ascIndex) / 2;
                    if (T[ascending[mid]] > temp) {
                        ascIndex = mid;
                    } else {
                        left = mid + 1;
                    }
                }
                result[i] = ascIndex == T.length ? 0 : ascending[ascIndex] - i;
//            }
                ascending[--ascIndex] = i;
            }
            return result;
        }


}
