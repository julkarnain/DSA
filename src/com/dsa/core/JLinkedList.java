package com.dsa.core;

public class JLinkedList {
	private Node head;

	public JLinkedList(){
		
	}
	public void add(Object data)
	{
		if(head == null){
		   head = new Node(data);
		}
		
		Node jTemp = new Node(data);
		Node jCurrent = head;
		
		if(jCurrent != null){
			
			while(jCurrent.getNext() != null){
				jCurrent = jCurrent.getNext();
			}
			jCurrent.setNext(jTemp);
		}
	}
	
	private class Node{
		Node next;
		Object data;
		
		// Node constructor
		public Node(Object dataValue) {
		   next = null;
		   data = dataValue;
		}
		public Node(Node nextValue, Object dataValue){
			next = nextValue;
			data = dataValue;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public Object getData() {
			return data;
		}
		public void setData(Object data) {
			this.data = data;
		}
	}
}
