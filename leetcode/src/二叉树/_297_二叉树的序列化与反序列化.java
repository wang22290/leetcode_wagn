package 二叉树;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * created by wagn on 2020/6/16
 */
public class _297_二叉树的序列化与反序列化 {

    // Encodes a tree to a single string.

    public String rserialize(TreeNode root,String str){
        if (root == null){
            str += "None,";
        }else {
            str += str.valueOf(root.val) + ",";
            str = rserialize(root.left,str);
            str = rserialize(root.right,str);
        }
        return str;
    }

    public String serialize(TreeNode root) {
        return rserialize(root,"");
    }

    public  TreeNode rdeserialize(List<String> l){
        if (l.get(0).equals("None")){
            l.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(l.get(0)));
        l.remove(0);
        root.left = rdeserialize(l);
        root.right = rdeserialize(l);
        return root;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] data_array = data.split(",");
        List<String> data_list = new LinkedList<String>(Arrays.asList(data_array));
        return rdeserialize(data_list);
    }

}
