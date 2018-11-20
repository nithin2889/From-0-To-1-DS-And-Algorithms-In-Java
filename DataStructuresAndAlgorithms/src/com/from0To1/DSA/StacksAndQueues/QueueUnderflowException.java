package com.from0To1.DSA.StacksAndQueues;

public class QueueUnderflowException extends Exception {

	private static final long serialVersionUID = 2615530152149556821L;

	public QueueUnderflowException() {
	}
	
	public QueueUnderflowException(String message) {
		super(message);
	}
	
}