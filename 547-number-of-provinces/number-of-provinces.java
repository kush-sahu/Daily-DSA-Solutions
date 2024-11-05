class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>>adj=new ArrayList<>();
        int n=isConnected.length;
        for (int i = 0; i < n; i++)  adj.add(new ArrayList<>());
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
         int c=0;
        int v[]=new int[n];
        
        for(int i=0;i<n;i++){
            if(v[i]!=1){
                c++;
                Queue<Integer>q=new LinkedList<>();
                q.add(i);
                bfs(adj,v,q);
            }
        }
        return c;

    }
    public void bfs(List<List<Integer>>adj,int v[],Queue<Integer>q){
         while(q.size()>0){
          int node=q.remove();
          
          for(int ele:adj.get(node)){
            if(v[ele]==0){
                q.add(ele);
                v[ele]=1;
            }
          }
         }
    } 
}