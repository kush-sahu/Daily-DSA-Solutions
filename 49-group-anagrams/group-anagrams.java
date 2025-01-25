class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        String arr[]=new String[strs.length];

        for(int i=0;i<strs.length;i++){
            String a=strs[i];
            char charArr[]=a.toCharArray();
            Arrays.sort(charArr);
            arr[i]=new String(charArr);
         }

        ArrayList<List<String>>list=new ArrayList<>();
        HashSet<String>hm=new HashSet<>();
        for(int i=0;i<strs.length;i++){
            if(!hm.contains(arr[i])){
            hm.add(arr[i]);
            List<String>l=new ArrayList<>();
            l.add(strs[i]);
            for(int j=i+1;j<strs.length;j++){
                if(arr[i].equals(arr[j])){
                    l.add(strs[j]);
                }
            }
            list.add(l);
            }
            
        }
        return list;
    }
}