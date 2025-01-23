class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
           hm.put( magazine.charAt(i),hm.getOrDefault(magazine.charAt(i),0)+1);
        }

        for(int i=0;i<ransomNote.length();i++){
            if(hm.containsKey(ransomNote.charAt(i))==true){
                hm.put(ransomNote.charAt(i),hm.get(ransomNote.charAt(i))-1);
                if(hm.get(ransomNote.charAt(i))==0){
                    hm.remove(ransomNote.charAt(i));
                }
            }else return false;
        }
        return true;
    }
}