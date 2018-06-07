import java.util.HashMap;
import java.util.LinkedList;

class LC146 {
    int capacity;
    LinkedList<int[]> list = new LinkedList<>();
    HashMap<Integer, int[]> map = new HashMap<>();
    public LC146(int c) {
        this.capacity = c;
    }
    
    public int get(int key) {
        int res = -1;
        if (map.containsKey(key)) { 
            int[] val = map.get(key);
            list.remove(val);
            res = val[1];
            list.addLast(val);
        }
        
        return res;
    }
    
    public void put(int key, int value) {
        int[] val = new int[]{key, value};
        if (map.containsKey(key)) {
            list.remove(map.get(key));
        }
        list.addLast(val);
        map.put(key,val);
        if (list.size()>capacity) {
            int[] firstVal = list.get(0);
            list.removeFirst();
            map.remove(firstVal[0]);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */