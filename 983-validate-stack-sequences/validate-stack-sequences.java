class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer>st=new Stack<>();
        int i=0;
        int j=0;
        while(i<pushed.length && j<popped.length){
            st.push(pushed[i]);

            while(st.size()>0 && st.peek()==popped[j]){
                st.pop();
                j++;
            }
            i++;
        }
        if(st.size()>0)return false;
        else return true;
    }
}