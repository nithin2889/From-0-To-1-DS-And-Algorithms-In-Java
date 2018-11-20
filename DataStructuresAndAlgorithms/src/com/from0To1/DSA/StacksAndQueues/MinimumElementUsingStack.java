package com.from0To1.DSA.StacksAndQueues;

public class MinimumElementUsingStack {

	private Stack<Integer> stack = new Stack<Integer>();
	private Stack<Integer> minimumStack = new Stack<Integer>();

	public void push(int data) throws StackOverflowException, StackUnderflowException {
		int min = data;
		if (!(minimumStack.isEmpty())) {
			if (min > minimumStack.peek()) {
				min = minimumStack.peek();
			}
		}
		stack.push(data);
		minimumStack.push(min);
	}

	public int pop() throws StackUnderflowException {
		minimumStack.pop();
		return stack.pop();
	}

	public int getMinimum() throws StackUnderflowException {
		return minimumStack.peek();
	}

}