// class Solution {
//     public boolean canChange(String start, String target) {
//         int i=0;
//         int j=0;
//         int n=start.length();
//         while(i<n || j<n){
            
//             while(i<n && start.charAt(i)=='_')i++;
//             while(j<n && target.charAt(j)=='_')j++;
//             if(i==n || j==n)return i==n && j==n;
//             char ch1=start.charAt(i);
//             char ch2=target.charAt(j);
//            if(ch1!=ch2)return false;
//            if(ch1=='L' && i<j)return false;
//            if(ch1=='R' && i>j)return false;
//            i++;
//            j++;
//         }
//         return true;
//     }
// }

class Solution {
    public boolean canChange(String start, String target) {
        int i=0;
        int j=0;
        int n=start.length();
        while(i<n || j<n){
            
            while(i<n && start.charAt(i)=='_')i++;
            while(j<n && target.charAt(j)=='_')j++;
            if(i==n || j==n)return i==n && j==n;
            char ch1=start.charAt(i);
            char ch2=target.charAt(j);
           if(ch1!=ch2)return false;
           if(ch1=='L' && i<j)return false;
           if(ch1=='R' && i>j)return false;
           i++;
           j++;
        }
        return true;
    }
}