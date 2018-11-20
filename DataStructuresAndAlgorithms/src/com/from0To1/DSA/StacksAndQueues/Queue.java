package com.from0To1.DSA.StacksAndQueues;

import java.lang.reflect.Array;

public class Queue<T> {

	private static final int SPECIAL_EMPTY_VALUE = -1;
	private static int MAX_VALUE = 40;
	private T[] elements;

	private int headIndex = SPECIAL_EMPTY_VALUE;
	private int tailIndex = SPECIAL_EMPTY_VALUE;

	public Queue(Class<T> clazz) {
		elements = (T[]) Array.newInstance(clazz, MAX_VALUE);
	}

	public boolean isEmpty() {
		return headIndex == SPECIAL_EMPTY_VALUE;
	}

	public boolean isFull() {
		int nextIndex = (tailIndex + 1) % elements.length;
		return nextIndex == headIndex;
	}

	public void enqueue(T data) throws QueueOverflowException {
		if (isFull()) {
			throw new QueueOverflowException("Queue is full. Cannot insert new element");
		}
		tailIndex = (tailIndex + 1) % elements.length;
		elements[tailIndex] = data;

		if (headIndex == SPECIAL_EMPTY_VALUE) {
			headIndex = tailIndex;
		}
	}

	public T dequeue() throws QueueUnderflowException {
		if (isEmpty()) {
			throw new QueueUnderflowException("Queue is empty. Cannot remove anything.");
		}

		T data = elements[headIndex];

		if (headIndex == tailIndex) {
			headIndex = SPECIAL_EMPTY_VALUE;
		} else {
			headIndex = (headIndex + 1) % elements.length;
		}

		return data;
	}

}