package edu.escuelaing.arep.app;

import org.junit.Test;
import org.junit.Assert;

public class AppTest {

	/**
	 * Deberia calcular la media con los datos dados
	 */
	@Test
    public void shouldCalculateMean() {
		Double[] list = {50.6,80.5,75.3,31.3,33.9,50.0,55.3};
		LinkedList linkedlist = new LinkedList();
		for (int i = 0; i < list.length; i++) {
			linkedlist.Add(list[i]);
		}
		Calculator calculator = new Calculator(linkedlist);
		Assert.assertEquals(53.84, calculator.Mean(), 0.00001);
    }
	/**
	 * deberia añedir las lista de numero a una lista encadenada
	 */
	@Test
	public void shouldAddLinkedList() {
		Double[] list = {1.0,2.1,3.2,4.3,5.4,6.5,7.6,8.7,9.8};
		LinkedList linkedlist = new LinkedList();
		for (int i = 0; i < list.length; i++) {
			linkedlist.Add(list[i]);
		}
		Assert.assertEquals(1.0, linkedlist.getFirst().getData(), 0.00001);
		Assert.assertEquals(9.8, linkedlist.getLast().getData(), 0.00001);
	}
	/**
	 * Deberia dar el siguiente nodo al primero con valor 4.3
	 */
	@Test
	public void shouldNextNode() {
		Double[] list = {3.3,4.3,5.0};
		LinkedList linkedlist = new LinkedList();
		for (int i = 0; i < list.length; i++) {
			linkedlist.Add(list[i]);
		}
		Node node = linkedlist.getFirst();
		node = linkedlist.Next(node);
		Assert.assertEquals(4.3, node.getData(), 0.00001);		
	}
	
	/**
	 * Deberia calcular la desviacion estandar
	 */
	@Test
	public void shouldStandardDeviation() {
		Double[] list = {50.6,80.5,75.3,31.3,33.9,50.0,89.3};
		LinkedList linkedlist = new LinkedList();
		for (int i = 0; i < list.length; i++) {
			linkedlist.Add(list[i]);
		}
		Calculator calculator = new Calculator(linkedlist);
		Assert.assertEquals(23.07, calculator.Dev(), 0.00001);
	}
}
