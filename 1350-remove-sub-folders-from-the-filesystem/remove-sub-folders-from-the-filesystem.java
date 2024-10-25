// class Solution {
//     public List<String> removeSubfolders(String[] folder) {
//         ArrayList<String>list=new ArrayList<>();
//         StringBuilder sb= new StringBuilder();
//         HashSet<String>set=new HashSet<>();
//         list.add(folder[0]);
//         set.add(folder[0]);

//         for(int i=1;i<folder.length;i++){
//             String s=folder[i];
//             int j=0;
//             int signal=0;
//             while(j<s.length()){
                
//                 j++;
//                 if(j==s.length()-1)break;
//                 sb.append('/');
//                 while(s.charAt(j)!='/'){
//                        sb.append(s.charAt(j));
//                        j++;
//                 }
//                 if(set.contains(sb.toString())==true){
//                     signal=1;
//                     break;
//                 }
//             }
            
//             if(signal==0){
//                 list.add(sb.toString());
//             }
//             sb.setLength(0);
        
//             set.add(folder[i]);
//         }
//         return list;
//     }
// }













class Solution {
    public List<String> removeSubfolders(String[] folder) {
        // Sort the folders lexicographically so parent folders come before their subfolders
        Arrays.sort(folder);
        
        // Initialize result list with the first folder
        List<String> ans = new ArrayList<>();
        ans.add(folder[0]);
        
        // Iterate through remaining folders starting from index 1
        for (int i = 1; i < folder.length; i++) {
            // Get the last added folder path and add a trailing slash
            String lastFolder = ans.get(ans.size() - 1) + "/";
            
            // Check if current folder starts with lastFolder
            // If it doesn't start with lastFolder, then it's not a subfolder
            if (!folder[i].startsWith(lastFolder)) {
                ans.add(folder[i]);
            }
        }
        
        return ans;
    }
}
