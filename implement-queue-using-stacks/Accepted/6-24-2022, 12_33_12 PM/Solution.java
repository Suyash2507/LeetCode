// https://leetcode.com/problems/implement-queue-using-stacks

class MyQueue {
    Stack<Integer> s;
    public MyQueue() {
        s=new Stack<Integer>();
    }
    public void push(int x) {
        s.push(x);
    }
    public int pop() {
        Stack b= new Stack<>(); 
        while(s.size()>1){
            b.push((int)s.pop());
        }    
        int a = s.pop();
        while(b.size()!=0){
            s.push((int)b.pop());
        }
        return a;
    }
    
    public int peek() {
        Stack b= new Stack<>(); 
        while(s.size()>1){
            b.push((int)s.pop());
        }    
        int a = s.pop();
        b.push(a);
        while(b.size()!=0){
            s.push((int)b.pop());
        }
        return a;
    }
    
    public boolean empty() {
        return s.size()==0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */