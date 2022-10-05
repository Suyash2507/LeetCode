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
        Queue<Integer> temp= new LinkedList<Integer>();
        while(q.size()>1){
            int a= q.remove();
            temp.add(a);
        }
        int b = q.remove();
        q = temp;
        return b;  
    }
    
    public int top() {
        return top;  
    }
    
    public boolean empty() {
        if(q.size()==0)
            return true;
        else
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