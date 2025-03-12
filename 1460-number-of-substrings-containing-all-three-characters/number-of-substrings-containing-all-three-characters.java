class Solution {
    public int numberOfSubstrings(String s) {
       HashMap<Character,Integer>set=new HashMap<>();
       int st=0;
       int end=0;
       int c=0;
       int n=s.length();
       while(end<s.length()){
            set.put(s.charAt(end),set.getOrDefault(s.charAt(end),0)+1);
           
         while( set.size()==3){
            c+=n-end;
            
            set.put(s.charAt(st),set.get(s.charAt(st))-1);
            if(set.get(s.charAt(st))==0)set.remove(s.charAt(st));
            st++;
          }
         
          
       
       end++;
       
    }
    return c;
    }
}