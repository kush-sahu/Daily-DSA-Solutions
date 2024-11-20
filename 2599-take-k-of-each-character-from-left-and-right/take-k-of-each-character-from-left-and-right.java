class Solution {
    public int takeCharacters(String s, int k) {
        int n=s.length();
     
        int a=0;int b=0; int c=0;
        for(int i=0;i<n;i++){
            char ch1=s.charAt(i);
            if(ch1=='a'){
                    a++;
                  }else if(ch1=='b'){
                    b++;
                  }else c++;
        }
  if(a<k || b<k || c<k)return -1;

        int i=0;int j=0;
        int ans=0;
        int a1=a;
        int b1=b;
        int c1=c;

        while(j<n){
            char ch=s.charAt(j);
         if(ch=='a'){
             a1--;
         }else if(ch=='b'){
            b1--;
         }else if(ch=='c'){
            c1--;
         }
         
         while(i<=j && (a1<k || b1<k || c1<k)){
            char ch1=s.charAt(i);
            if(ch1=='a'){
             a1++;
         }else if(ch1=='b'){
            b1++;
         }else if(ch1=='c'){
            c1++;
         }
         i++;
         }
         ans=Math.max(ans,j-i+1);
         j++;
        }
        return n-ans;
    }
}

