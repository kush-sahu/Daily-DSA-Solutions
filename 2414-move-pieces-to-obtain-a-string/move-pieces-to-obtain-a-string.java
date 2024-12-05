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
        
        if(ch1=='L' && ch2=='L'&& i>=j){
             i++; j++; 
         }else if(ch1=='R' && ch2=='R'&& i<=j){
             i++; j++;
         }else{  
               return false;
             }
        }
        return true;
    }
}