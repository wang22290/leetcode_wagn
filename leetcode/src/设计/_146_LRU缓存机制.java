package 设计;

import java.util.HashMap;

/**
 * 146. LRU缓存机制
 * https://leetcode-cn.com/problems/lru-cache/
 * created by wagn on 2020/5/25
 */
public class _146_LRU缓存机制 {

    class Node{
        public int key ,val;
        public Node next,prev;
        public Node(int k,int v){
            this.key = k;
            this.val = v;
        }
    }

    class DoubleList{
        private Node head,tail;//头尾节点
        private int size;      //链表元素长度

        public DoubleList(){
            head = new Node(0,0);
            tail = new Node(0,0);
            head.next = tail;
            head.prev = head;
            size = 0;
        }

        public void addFirst(Node node){
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
            size++;
        }
        public void remove(Node node){
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
        }

        public Node removeLast(){
            if (tail.prev == head)return null;
            Node last = tail.prev;
            remove(last);
            return last;
        }

        public int size(){
            return size;
        }
    }




    class LRUCache {
        private HashMap<Integer,Node> map;
        private DoubleList cache;
        private int cap;

        public LRUCache(int capacity) {
            this.cap = capacity;
            map = new HashMap<>();
            cache = new DoubleList();
        }

        public int get(int key) {
            if (!map.containsKey(key)){
                return -1;
            }
            int val = map.get(key).val;
            //把数据放在前面，
            put(key,val);
            return val;
        }

        public void put(int key, int value) {
            Node x = new Node(key,value);
            if (map.containsKey(key)){
                //删除旧节点
                cache.remove(map.get(key));
                cache.addFirst(x);
                map.put(key,x);
            }else {
                if (cap == cache.size()){
                    Node last = cache.removeLast();
                    map.remove(last.key);
                }
                cache.addFirst(x);
                map.put(key,x);
            }
        }
    }

}
