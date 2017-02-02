package leetcode.stacks;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {

  

	Deque<Integer> stack;
	Deque<Integer> low;
	
	//try using an implementation of Node that has two pointers for next and prev//doubly linked list

    public MinStack() {
    	 stack = new LinkedList();
 		 low = new LinkedList();
 		
    	
    }
    
    
    public void push(int x) {
   
    		stack.addFirst(x);
    		
    		if(low.size()==0){
    			low.addFirst(x);
    		}
    		else if(x <= low.getFirst()){
    			low.addFirst(x);
    		}
   
    }
    
    public void pop() {
    	
    	if( stack.pollFirst().equals(low.getFirst()))
    		low.pollFirst();
    	
    
    }
    
    public int top() {
        return stack.getFirst();
    }
    
    public int getMin() {
    	return low.getFirst();
    }


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		minStack.getMin();   
		minStack.pop();
		minStack.top();      

		minStack.getMin();
//		minStack.pop();
//		minStack.getMin();   
//		minStack.pop();
//
//		minStack.top();      
//		minStack.getMin();   
	}

}
