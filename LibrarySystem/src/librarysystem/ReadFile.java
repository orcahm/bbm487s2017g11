/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {

	private ArrayList<String> line;
	
	public ReadFile(String filename) throws IOException{
		this.line = new ArrayList<String>();
		String str = null;
		
		try{
		
			FileReader file = new FileReader(filename);
			BufferedReader bf = new BufferedReader(file);
			
			while((str=bf.readLine()) != null ){
				this.line.add(str);
			}
		}catch(Exception e){
			System.err.println("ERROR : " + e.getMessage());
		}
	}

	public ArrayList<String> getLine() {
		return line;
	}
        
        public String getLine(int index) {
		return line.get(index);
	}
}
