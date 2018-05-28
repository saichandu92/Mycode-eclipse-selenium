package Test1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
//import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

//import org.testng.annotations.Test;


public class fileread {
	
	
	public void filereader1() {
		String MS;
		try {
		FileReader FM = new FileReader ("D:\\Testfile.txt");
  		BufferedReader d = new BufferedReader(FM);
		while((MS= d.readLine())!=null) {
			
		 System.out.println(MS);
			
		}
		//d.read();
		
		}
		catch(FileNotFoundException e) {	
		}
		catch(IOException e) {
			
		
		}
		
			}
	
	

	public static void main(String[] args) {
	fileread fr = new fileread();
	fr.filereader1();

	}

}
