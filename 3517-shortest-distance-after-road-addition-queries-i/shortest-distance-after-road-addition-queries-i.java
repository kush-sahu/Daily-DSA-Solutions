class Solution {
    public int bfs(ArrayList<List<Integer>>adj,int n){
        boolean v[]=new boolean[n];
        Queue<Integer>q=new LinkedList<>();
        q.add(0);
        v[0]=true;
        int level=0;
         while (!q.isEmpty()) {
        int size = q.size(); // Number of nodes at the current level
        for (int i = 0; i < size; i++) {
            int curr = q.remove();
            for (int e : adj.get(curr)) {
                if (e == n - 1) return level + 1; // Return as soon as the target is found.
                if (!v[e]) {
                    v[e] = true;
                    q.add(e);
                }
            }
        }
        level++; // Increment level after processing all nodes at the current level.
    }
    return -1;
    }
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        ArrayList<List<Integer>>adj=new ArrayList<>();
        //Adjaciency list 
        for (int i = 0; i < n; i++) {
    adj.add(new ArrayList<>());
    }



        for(int i=0;i<n-1;i++){
            adj.get(i).add(i+1);
        }

        int ans[]=new int[queries.length];

        for(int i=0;i<queries.length;i++){
            int a=queries[i][0];
            int b=queries[i][1];
            adj.get(a).add(b);
            ans[i]=bfs(adj, n);
        }
        return ans;

    }
}