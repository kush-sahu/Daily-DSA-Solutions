class Solution {
    public List<String> removeSubfolders(String[] folder) {
        ArrayList<String>list=new ArrayList<>();
       Arrays.sort(folder);
        String prev="";
        for(int i=0;i<folder.length;i++){
            String s=folder[i];
            if(prev.isEmpty() || ! s.startsWith(prev +'/')){
                list.add(s);
                prev=s;
            }
        }
        return list;
    }
}