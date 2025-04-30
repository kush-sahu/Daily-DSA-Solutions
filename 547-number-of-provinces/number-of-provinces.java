class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>>adj=new ArrayList<>();
        int n=isConnected.length;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                
                if( isConnected[i][j]==1){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int ans=0;
        boolean v[]=new boolean[n];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++)st.push(i);
        while(st.size()>0){ 
            int a=st.pop(); 
            if(!v[a]){
                ans++;
                v[a]=true;
            }
            for(int e:adj.get(a)){
                if(!v[e]){
                   v[e]=true;
                   st.push(e);
                }
                
            }
           
        }
        return ans;
    }
}