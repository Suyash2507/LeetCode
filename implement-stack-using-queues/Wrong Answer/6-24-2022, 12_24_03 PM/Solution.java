// https://leetcode.com/problems/implement-stack-using-queues

class MyStack {
    Queue<Integer> q;
    int top;
    public MyStack() {
        q=new LinkedList<Integer>();
    }    
    public void push(int x) {
        q.add(x);
        top = x;
    }  
    public int pop() {
        Queue<Integer> p = new LinkedList<>();
        while(q.size()>1){
            p.add((int)q.poll());
        }
        int w= q.poll();
        q = p;
        return w;
        
    }
    
    public int top() {
        return top;
    }
    
    public boolean empty() {
        if(q.size()==0)
            return true;
        return false;
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