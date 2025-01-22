class MyStack {
    public Queue<Integer> q1;
    public Queue<Integer> q2;
    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    
    public void push(int x) {
      q1.add(x);   
    }
    
    public int pop() {
      while(q1.size()>1){
        q2.add(q1.poll());
      }  
      int top=q1.poll();
  
      Queue <Integer>temp= q2;
      q2=q1;
      q1=temp;
      return top;
    }
    
    public int top() {
        while(q1.size()>1){
        q2.add(q1.poll());
      }  
      int top=q1.poll();
        q2.add(top);
      Queue <Integer>temp= q2;
      q2=q1;
      q1=temp;
      return top;
    }
    
    public boolean empty() {
        return q1.isEmpty();
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