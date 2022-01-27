package edu.kis.vh.nursery.list;

public class IntLinkedList {

	public static final int EMPTY_LIST_ERROR = -1;
	private Node lastNode;
	private int newElement;

	public void push(int i) {
		if (lastNode == null)
			lastNode = new Node(i);
		else {
			lastNode.setNext(new Node(i));
			lastNode.getNext().setPrev(lastNode);
			lastNode = lastNode.getNext();
		}
	}

	public int getNewElement() {
		return newElement;
	}

	public Node getLastNode() {
		return lastNode;
	}


	public void setLastNode(Node lastNode) {
		this.lastNode = lastNode;
	}

	public void setNewElement(int newElement) {
		this.newElement = newElement;
	}

	public boolean isEmpty() {
		return lastNode == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_LIST_ERROR;
		return lastNode.getValue();
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_LIST_ERROR;
		int ret = lastNode.getValue();
		lastNode = lastNode.getPrev();
		return ret;
	}

}
