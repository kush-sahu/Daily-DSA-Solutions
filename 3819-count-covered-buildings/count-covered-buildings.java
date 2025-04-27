class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
         HashMap<Integer,TreeSet<Integer>>row=new HashMap<>();
         HashMap<Integer, TreeSet<Integer>>col=new HashMap<>();

         for(int [] b:buildings){
            int x=b[0];
            int y=b[1];
            row.computeIfAbsent(x,k->new TreeSet<>()).add(y);
            col.computeIfAbsent(y,k->new TreeSet<>()).add(x);
         }
         int c=0;
         for(int [] b:buildings){
            int x=b[0];
            int y=b[1];
            boolean up=col.get(y).lower(x)!=null;
            boolean down=col.get(y).higher(x)!=null;
            boolean left=row.get(x).lower(y)!=null;
            boolean right=row.get(x).higher(y)!=null;
            
            if(up && down && right && left)c++; 
         }
         return c;
    }
}