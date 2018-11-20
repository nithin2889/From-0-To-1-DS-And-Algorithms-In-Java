package com.from0To1.DSA.StacksAndQueues;

public class Stack<T> {

	private static int MAX_SIZE = 40;

	private Element<T> top;
	private int size = 0;

	public void push(T data) throws StackOverflowException {
		if (size == MAX_SIZE) {
			throw new StackOverflowException("Stack is full. Cannot push any elements into it.");
		}
		Element<T> elem = new Element<T>(data, top);
		top = elem;
		size++;
	}

	public T pop() throws StackUnderflowException {
		if (size == 0) {
			throw new StackUnderflowException("Stack is empty. Cannot pop any elements from it.");
		}
		T topElement = top.getData();
		top = top.getNext();
		size--;

		return topElement;
	}

	public T peek() throws StackUnderflowException {
		if (size == 0) {
			throw new StackUnderflowException("Stack is empty. Cannot peek into any elements in it.");
		}
		T topElement = top.getData();
		return topElement;
	}

}