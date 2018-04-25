package org.helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class read {
	public static void main(String[]args) throws IOException{

	    FileReader in = new FileReader("C:/Users/leroi/Documents/EXIA/Prosit 44/Workshop");
	    BufferedReader br = new BufferedReader(in);

	    while (br.readLine() != null) {
	        System.out.println(br.readLine());
	    }
	    in.close();

	}
}
