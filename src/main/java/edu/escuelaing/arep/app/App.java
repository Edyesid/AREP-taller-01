package edu.escuelaing.arep.app;

import java.io.*;
/**
 * @author Edwin Rodriguez
 * Clase principal de lectura de archivos y impresion de los datos calculados
 *
 */
public class App {
	/**
	 * Imprime los datos calculador y especifica que archivos leer para el respectivo calculo
	 * @param args argumentos
	 */
    public static void main( String[] args ) {
    	App app = new App();
    	LinkedList list1 = app.Reader("table1/column1.txt");
    	LinkedList list2 = app.Reader("table1/column2.txt");
    	
    	Calculator point1 = new Calculator(list1);
    	Calculator point2 = new Calculator(list2);
    	
    	System.out.println("Table 1: Column 1, Mean: " + point1.Mean() + " | " + "Standard deviation: " + point1.Dev());
    	System.out.println("Table 1: Column 2, Mean: " + point2.Mean() + " | " + "Standard deviation: " + point2.Dev());
    	 
    	
    }
    
    /**
     * Lee los valores de un archivo dada una ruta especifica y crea la lista doblemente encadenada con los valores del archivo
     * @param path es la ruta del archivo
     * @return la lista doblemente encadenada con los datos
     */
    public LinkedList Reader (String path) {
    	File file = null;
    	FileReader fileReader = null;
    	BufferedReader bufferedReader = null;
    	LinkedList list = new LinkedList();
    	
    	try {
    		file = new File(path);
    		fileReader = new FileReader(file);
    		bufferedReader = new BufferedReader(fileReader);
    		
    		String line;
    		while ((line = bufferedReader.readLine()) != null) {
    			double date = Double.parseDouble(line);
    			list.Add(date);
    		}
    	} catch(Exception e) {
    		e.printStackTrace();
    	} finally {
    		try {
    			if(null != fileReader) {
    				fileReader.close();
    			}
    		} catch (Exception e2) {
    			e2.printStackTrace();
    		}
    	}
    	return list;
    }
}