class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        
        Arrays.sort(citations);
        int h=0;
        int low=0;
        int high=citations.length-1;
        while(low<=high){
           int mid=low+(high-low)/2;
           int a=citations[mid];
           if(n-mid==a){
            return a;
           }else if(n-mid>a){
          
            low=mid+1;
           }else{
            high=mid-1;
           }
        }
     return n-low;
        
    }
}