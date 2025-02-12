class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer>hmp=new HashMap<>();
        HashMap<Character,Integer>hms=new HashMap<>();
        ArrayList<Integer>list =new ArrayList<>();
  if(p.length()>s.length()) return list;
        for(int i=0;i<p.length();i++){
            hmp.put(p.charAt(i),hmp.getOrDefault(p.charAt(i),0)+1);
        }
        int count=0;
         for(int i=0;i<p.length();i++){
            hms.put(s.charAt(i),hms.getOrDefault(s.charAt(i),0)+1);

            if(hms.get(s.charAt(i))<=hmp.getOrDefault(s.charAt(i),0)){
                count++;
            }
        }
        if(count==p.length())list.add(0);

        int st=0;
        int end=p.length();
        while(end<s.length()){
        char ch1=s.charAt(st);
            char ch2=s.charAt(end);

             hms.put(ch2,hms.getOrDefault(ch2,0)+1);

             if(hms.get(ch2)<=hmp.getOrDefault(ch2,0)){
                count++;
            }
              hms.put(ch1,hms.getOrDefault(ch1,0)-1);

              if(hms.get(ch1)<hmp.getOrDefault(ch1,0))count--;

              if(count==p.length())list.add(st+1);
              st++;
              end++;
        }
     return list;
    }
}