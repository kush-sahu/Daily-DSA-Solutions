class Solution {
    public boolean wordPattern(String pattern, String s) {
        String arr[]=s.split(" ");
        if(arr.length!=pattern.length())return false;
        HashMap<Character,String>hm=new HashMap<>();
        HashSet<String>set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])==false){
            hm.put(pattern.charAt(i),arr[i]);
            set.add(arr[i]);
            }
        }
        String ans="";
        for(int i=0;i<pattern.length();i++){
            ans+=hm.get(pattern.charAt(i));
            if(i<pattern.length()-1){
                ans+=" ";
            }
        }
        return ans.equals(s);
       
    }
}