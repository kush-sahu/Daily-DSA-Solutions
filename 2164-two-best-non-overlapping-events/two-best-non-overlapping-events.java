class Solution {
    public int binary(int event[][],int target){
        int low=0;
        int high=event.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(event[mid][0]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
       return (low < event.length) ? low : -1;
    }
    public int maxTwoEvents(int[][] events) {
        Arrays.sort(events,(a,b)->Integer.compare(a[0],b[0]));
        int ans=0;
        int n=events.length;
        int sufix[]=new int[n];
        sufix[n-1]=events[n-1][2];
        for(int i=n-2;i>=0;i--){
            sufix[i]=Math.max(sufix[i+1],events[i][2]);
        }

        

        for(int i=0;i<events.length;i++){
            int currval=events[i][2];
            int index=binary(events,events[i][1]+1);

            if(index!=-1){
                currval+=sufix[index];
            }
            
            ans=Math.max(currval,ans);
        }
        return ans;
    }
}