class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>hm=new HashMap<>();
        HashMap<Character,Character>hm1=new HashMap<>();
        if(s.length()!=t.length())return false;

        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(hm.containsKey(ch1)==false && hm1.containsKey(ch2)==false ){
                hm.put(ch1,ch2);
                 hm1.put(ch2,ch1);
            }else if(hm.containsKey(ch1)==true ){
                if(hm.get(ch1)==t.charAt(i)){
                continue;
                }else return false;
            }else if(hm1.containsKey(ch2)==true ){
                if(hm1.get(ch2)==s.charAt(i)){
                 continue;
                }else return false;
            }
        }
        return true;
    }
}