package edu.escuelaing.arep.app;
/**
 * @author Edwin Rodriguez
 * Calculator calcula la media y la desviacion estandar de una lista doblemente encadenada de datos
 */
public class Calculator {
	private int len;
	private LinkedList list;
	public Calculator(LinkedList list) {
		this.list = list;
		this.len = list.getSize();
	}
	
	public double Mean() {
		double sum = 0;
		double mean = 0;
		Node node = list.getFirst();
		while (node != null) {
			sum += node.getData();
			node = list.Next(node);
		}
		mean = sum / len;
		return Math.round(mean * 100.0) / 100.0;
	}
	
	public double Dev() {
		double dev = 0;
		double sum = 0;
		double mean = this.Mean();
		Node node = list.getFirst();
		while (node != null) {
			sum = sum + (Math.pow((node.getData() + (-mean)), 2));
			node = list.Next(node);
		}
		
		dev = Math.sqrt(sum / (len - 1));
		return Math.round(dev * 100.0) / 100.0;
	}
	
}
