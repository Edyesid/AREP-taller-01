package edu.escuelaing.arep.app;

import java.io.*;

public class App 
{
    public static void main( String[] args ) {
    	App app = new App();
    	app.Reader("table1/column1.txt");
    }
    
    public void Reader (String path) {
    	File file = null;
    	FileReader fileReader = null;
    	BufferedReader bufferedReader = null;
    	
    	try {
    		file = new File(path);
    		fileReader = new FileReader(file);
    		bufferedReader = new BufferedReader(fileReader);
    		
    		String line;
    		while ((line = bufferedReader.readLine()) != null) {
    			System.out.println(line);
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
    }
}
