package com.dataStructures;

public class DoublyLinkedList {

	DoublyNode headPtr;

	DoublyLinkedList() {
		headPtr = new DoublyNode();
	}

	public void addElement(int x) {
		DoublyNode temp = new DoublyNode();
		temp.setValue(x);
		temp.setNext(headPtr.getNext());
		if (headPtr.getNext() != null)
			headPtr.getNext().setPrev(temp);
		headPtr.setNext(temp);
		temp.setPrev(headPtr);

	}

	public void disp() {
		DoublyNode ptr = headPtr.getNext();
		while (ptr != null) {
			System.out.print(ptr.getValue() + ",");
			ptr = ptr.getNext();
		}
		System.out.println();
	}

	public void deleteDoublyNode(int x) {
		DoublyNode temp = searchNode(x);
		if (temp.getPrev() == null) {
			temp.setPrev(headPtr);
			temp.setPrev(null);
		} else {
			temp.getPrev().setNext(temp.getNext());
			temp = null;
		}
	}

	private DoublyNode searchNode(int x) {
		DoublyNode p = headPtr.getNext();
		while (p != null) {
			if (p.getValue() == x)
				break;
			p = p.getNext();
		}
		return p;
	}

	public static void main(String[] args) {
		DoublyLinkedList L = new DoublyLinkedList();
		L.addElement(12);
		L.addElement(-4);
		L.addElement(54);
		L.disp();
		L.deleteDoublyNode(54);
		L.disp();

	}

}
