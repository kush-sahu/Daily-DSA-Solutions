class MyStack {
    Queue<Integer>q;
    public void convert(Queue<Integer>q){
         int a[]=new int[q.size()];
        int i=a.length-1;
        while(q.size()>0){
          a[i]=q.remove();
          i--;
        }
        for(int j=0;j<a.length;j++){
            q.add(a[j]);
        }
    }

    public MyStack() {
        q=new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
       
        convert(q);
      int p=q.remove();
        convert(q);
        return p;
    }
    
    public int top() {
         convert(q);
      int p=q.peek();
        convert(q);
        return p;
    }
    
    public boolean empty() {
        if(q.size()==0)return true;
        else return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */