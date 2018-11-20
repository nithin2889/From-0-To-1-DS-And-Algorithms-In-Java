package com.from0To1.DSA.LinkedLists;

public class LinkedList<T extends Comparable<T>> implements Cloneable {

	private Node<T> head = null;

	public LinkedList() {
	}

	public int countNodes() {
		if (head == null) {
			return 0;
		} else {
			int count = 0;
			Node<T> curr = head;
			while (curr != null) {
				curr = curr.getNext();
				count++;
			}
			return count;
		}
	}

	public void printNodes() {
		if (head == null) {
			System.out.println("Linked List is empty and has no nodes in it.");
		} else {
			Node<T> curr = head;
			int i = 1;
			while (curr != null) {
				System.out.println("Node present at position: " + i + " with value " + curr.toString());
				curr = curr.getNext();
			}
		}
	}

	public void addNodeToLast(T data) {
		if (head == null) {
			head = new Node<T>(data);
		} else {
			Node<T> curr = head;
			while (curr.getNext() != null) {
				curr = curr.getNext();
			}
			curr.setNext(new Node<T>(data));
		}
	}

	public void deleteLinkedList() {
		head = null;
	}

	public void removeDuplicates() {
		int count = countNodes();
		if (count == 0 || count == 1) {
			return;
		} else {
			Node<T> curr = head;
			do {
				if (curr.getNext().getData().compareTo(curr.getData()) == 0) {
					curr = curr.getNext().getNext();
				} else {
					curr = curr.getNext();
				}
			} while (curr.getNext() != null);
		}
	}

}