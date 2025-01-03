class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st=new Stack<>();
       

        for(int i=0;i<asteroids.length;i++){
            if(st.size()==0 || asteroids[i]>0){
                st.push(asteroids[i]);
            }else if((st.size()==0 || st.peek()<0) && asteroids[i]<0){
                st.push(asteroids[i]);
            }else{
                
                int a=asteroids[i];
                while(st.size()>0 && a<0 && st.peek()>0 ){
                    int b=a*(-1);
                   if(b>st.peek()){
                    st.pop();
                    a=b*(-1);
                   }else if(b<st.peek()){
                    a=0;
                    break;
                   }else{
                    st.pop();
                    a=0;
                    break;
                   }
                }
                if( a<0  )st.push(a);
                
            }
        }
        int arr[]=new int[st.size()];
        int i=arr.length-1;
        while(st.size()>0){
            arr[i]=st.pop();
            i--;
        }
        return arr;

    }
}