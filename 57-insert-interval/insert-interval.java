class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int a=newInterval[0];
        int b=newInterval[1];
     ArrayList<int[]>list=new ArrayList<>();
   

        for(int i=0;i<intervals.length;i++){
            int x=intervals[i][0];
            int y=intervals[i][1];

            if(x>b){
                list.add( new int[]{a,b});
                while(i<intervals.length){
                      x=intervals[i][0];
                      y=intervals[i][1];
                     list.add(new int[]{x,y});
                     i++;
                }
                return list.toArray(new int[list.size()][]);
            }else if(y<a){
                list.add(new int[]{x,y});
               
            }else{
                  a=Math.min(a,x);
                b=Math.max(b,y);
            }
        }

        
         list.add(new int[]{a, b});
        return list.toArray(new int[list.size()][]);
    }
}

