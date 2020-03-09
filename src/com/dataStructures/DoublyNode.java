package com.dataStructures;

public class DoublyNode {
	private DoublyNode prev;
	private DoublyNode next;
	private int value;

	public DoublyNode() {
		prev = null;
		next = null;
		value = 0;
	}

	public DoublyNode getPrev() {
		return prev;
	}

	public void setPrev(DoublyNode prev) {
		this.prev = prev;
	}

	public DoublyNode getNext() {
		return next;
	}

	public void setNext(DoublyNode next) {
		this.next = next;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
