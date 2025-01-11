class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String,Integer>hm=new HashMap<>();
        int n=grid.length;
        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<n;j++){
               
                sb.append((char)(grid[j][i] + '0'));

             }
             hm.put(sb.toString(),hm.getOrDefault(sb.toString(),0)+1);
        }
        int count=0;
        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<n;j++){
                
                sb.append((char)(grid[i][j] + '0'));
             }
             if(hm.containsKey(sb.toString())==true){
                count+=hm.get(sb.toString());
             }
        }
        return count;
    }
}