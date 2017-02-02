package leetcode.stacks;

import java.util.Deque;
import java.util.LinkedList;

public class MyQueue {
	
	
	
	// Implement Queue using Stacks

//	push(x) -- Push element x to the back of queue.
//	pop() -- Removes the element from in front of queue.
//	peek() -- Get the front element.
//	empty() -- Return whether the queue is empty.

	
//	Notes:
//	You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
//	Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
//	You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).

	public static void main(String[] args) {
		
		MyQueue test = new MyQueue();
		test.push(1);
		test.push(2);
		test.peek();

	}
	Deque<Integer> a;
	
    public MyQueue() {
        a = new LinkedList();
    }
    
    public void push(int x) {
    	a.addLast(x);
        
    }
    
    public int pop() {
    	return a.removeFirst();
    }
    
    public int peek() {
        return a.peekFirst();
    }
    
    public boolean empty() {
    	 return a.isEmpty();
    } 

}
