import java.util.*;
public class LC834 {
	public int[] sumOfDistancesInTree(int N, int[][] edges) {
        List<Set<Integer>> list = new ArrayList<>();
        for (int i = 0; i<N; i++)
            list.add(new HashSet<>());
        for (int[] edge:edges) {
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }
        int[] dist = new int[N];
        for (int i = 0; i<N; i++)
            dist[i] = dfs(i,list,0, 0, -1);
        return dist;
        
    }
    
    private int dfs(int node, List<Set<Integer>> list, int level, int count, int from) {
        count+=level;
        for (int nextNode:list.get(node)) {
            if (nextNode == from) continue;
            count+=dfs(nextNode, list, level+1, count,node);
        }
        return count;
    }
}
