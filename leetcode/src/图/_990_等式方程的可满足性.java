package 图;

/**
 * 990. 等式方程的可满足性
 * https://leetcode-cn.com/problems/satisfiability-of-equality-equations/
 * created by wagn on 2020/6/8
 */
public class _990_等式方程的可满足性 {

    public static void main(String[] args) {

        String[] strs = new String[]{"a==b", "b==a"};
        boolean isf = equationsPossible(strs);
        System.out.println(isf);
    }

    public static boolean equationsPossible(String[] equations) {
        int length = equations.length;
        int[] parent = new int[26];
        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }

        for (String str : equations) {
            if (str.charAt(1) == '='){
                int index1 = str.charAt(0) - 'a';
                int index2 = str.charAt(3) - 'a';
                System.out.println("index1 ===" +index1);
                System.out.println("index2 ===" +index2);
                union(parent,index1,index2);
            }
        }

        for (String str : equations){
            if (str.charAt(1) == '!'){
                int index1 = str.charAt(0) - 'a';
                int index2 = str.charAt(3) - 'a';
                if (find(parent,index1) == find(parent,index2)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void union(int[] parent, int index1, int index2){
        parent[find(parent,index1)] = find(parent,index2);
    }

    public static int find(int[] parent, int index){
        while (parent[index] != index){
            parent[index] = parent[parent[index]];
            index = parent[index];
        }
        return index;
    }
}
