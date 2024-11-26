class Solution {
    public int findChampion(int n, int[][] edges) {
        int arr[]=new int[n];
        for(int i=0;i<edges.length;i++){
            int a=edges[i][0];
            int b=edges[i][1];
            arr[b]=arr[b]+1;
        }
        int c=0;
        int cham=0;
        for(int i=0;i<n;i++){
            
            if(arr[i]==0){
                
               cham=i;
             
              
                 c++;
                  if(c>1)return -1;
            }
        }
        return cham;
    }
}