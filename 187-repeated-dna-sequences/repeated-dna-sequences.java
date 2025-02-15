class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer>hm=new HashMap<>();
        HashSet<String>set=new HashSet<>();
        List<String>list=new ArrayList<>();
        for(int i=0;i<=s.length()-10;i++){
            String str=s.substring(i,i+10);
            if(hm.containsKey(str))set.add(str);
            hm.put(str,hm.getOrDefault(str,0)+1);
        }
        for(String value : set){
            list.add(value);
        }
        return list;
       


    }
}