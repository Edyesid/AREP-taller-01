package edu.escuelaing.arep.app;
/**
 * @author Edwin Rodriguez
 * Linkedlist es una lista doblemente encadenada que almacena Nodos
 */
public class LinkedList {
	
	private Node first;
	private Node last;
	private int size;

	/**
	 * Constructor de la clase LinkedList
	 */
	public LinkedList() {
		
		this.first = null;
		this.last = null;
		this.size = 0;
	}
	
	/**
	 * Adiciona un nodo al final de la lista
	 * @param date es el valor del nodo que se inserta
	 */
	public void Add(Double date) {
		Node node = new Node(date);
		if (last == null) {
			this.first = this.last = node;
		} else {
			last.setTail(node);
			node.setHead(last);
			last = node;
		}
		this.size += 1;
	}
	
	/**
	 * Retorna el nodo siguiente de un nodo dado
	 * @param actualNode nodo dado
	 * @return nodo sigueinte al dado
	 */
	public Node Next(Node actualNode) {
		return actualNode.getTail();
	}
	
	/**
	 * Retorna el nodo anterior a un nodo dado
	 * @param actualNode nodo dado
	 * @return nodo anterior al dado
	 */
	public Node Previous(Node actualNode) {
		
		if (actualNode.getHead() == null) {
			System.out.println("previous Node not exist");
			return null;
		} else {
			return actualNode.getHead();
		}
	}
	
	/**
	 * Retorna el primer nodo de la lista
	 * @return fist
	 */
	public Node getFirst() {
		return first;
	}
	
	/**
	 * Retona el ultimo nodo de la lista
	 * @return Node
	 */
	public Node getLast() {
		return last;
	}
	
	/**
	 * Retorna el tamaño de la lista
	 * @return size (tamaño de la lista)
	 */
	public int getSize() {
		return size;
	}
}
