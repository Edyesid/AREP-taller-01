package edu.escuelaing.arep.app;
/**
 * @author Edwin Rodriguez
 * El nodo contiene los datos ademas de sus conexiones con los demas nodos que esten en una lista doblemente encadenada
 */
public class Node {
	private Node head;
	private Node tail;
	private double data;
	
	/**
	 * Constructor de la clase Node
	 * @param data es el dato o valor del nodo
	 */
	public Node (double data) {
		this.head = null;
		this.tail = null;
		this.data = data;
	}
	
	/**
	 * Retorna el valor o dato del nodo
	 * @return data (valor del nodo)
	 */
	public double getData() {
		return data;
	}
	
	/**
	 * Retorna la referencia a su nodo siguiente
	 * @return tail
	 */
	public Node getTail() {
		return tail;
	}
	
	/**
	 * Retorna la referencia a su nodo anterior
	 * @return
	 */
	public Node getHead() {
		return head;
	}
	
	/**
	 * Cambia la referencia del nodo siguiente del nodo
	 * @param node es el nodo al cual se va a referenciar
	 */
	public void setTail(Node node) {
		this.tail = node;
	}
	
	/**
	 * Cambia la referencia del nodo anterio del nodo
	 * @param node es el nodo al cual se va a referenciar
	 */
	public void setHead(Node node) {
		this.head = node;
	}
}
