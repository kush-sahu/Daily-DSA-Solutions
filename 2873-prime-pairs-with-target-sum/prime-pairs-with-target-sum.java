class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        int arr[]=new int[n];
        if(n==1)return new ArrayList<>();
        arr[0]=1;
        arr[1]=1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                for(int j=arr[i];j<n;j+=i){
                    arr[j]=1;
                }
                arr[i]=0;
            }
        }
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<List<Integer>>ans=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                list.add(i);
                
            }
        }
        

        int i=0;
        int j=list.size()-1;

        while(i<=j){
            List<Integer>l=new ArrayList<>();
            if(list.get(i)+list.get(j)==n){
                l.add(list.get(i));
                l.add(list.get(j));
                ans.add(l);
                i++;
                j--;
            }else if(list.get(i)+list.get(j)<n)i++;
            else j--;
          }
        
        return ans;


    }
}