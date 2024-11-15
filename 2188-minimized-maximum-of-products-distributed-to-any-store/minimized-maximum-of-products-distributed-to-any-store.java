class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
     
        int sum=0;
        for(int i=0;i<quantities.length;i++){
            sum=Math.max(quantities[i],sum);
        }
        int low=1;
        int high=sum;
        
        while(low<high){
            int mid=low+(high-low)/2;

           int requiredStores = 0;

            for (int quantity : quantities) {
               
                requiredStores += (quantity + mid - 1) / mid; //<= similler to Math.ceil(quantity/mid);
            } 

            if(requiredStores<=n){
              high=mid;
            }else{
                low=mid+1;
            }
        }return low;
    }
}