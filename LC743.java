import java.util.Arrays;

class LC743 {
    public int networkDelayTime(int[][] times, int N, int K) {
        int[][] graph = new int[N+1][N+1];
        boolean[] visited = new boolean[N+1];
        for (int[] g : graph) {
            Arrays.fill(g, Integer.MAX_VALUE);
        }
        for (int[] arr : times) {
            graph[arr[0]][arr[1]] = arr[2];
        }
        visited[K] = true;
        boolean updated = true;
        int res = 0;
        int count = 1;
        while(updated) {
            updated = false;
            int toUpdate = 0;
            int min = Integer.MAX_VALUE;
            for (int i =1; i<=N; i++) {
                if (!visited[i] && graph[K][i]<min) {
                    updated = true;
                    min = graph[K][i];
                    toUpdate = i;
                }             
            }
            if (!updated) continue;
            visited[toUpdate] = true;
            for (int i = 1; i<=N; i++) {
                if (!visited[i] && graph[toUpdate][i]!= Integer.MAX_VALUE && graph[K][i] > min + graph[toUpdate][i]) {
                    graph[K][i] = min + graph[toUpdate][i];
                }
            }
            res = min;
            count++;
        }
        return count == N? -1:res;
    }
}