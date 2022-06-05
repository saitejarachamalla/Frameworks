package com.saiteja.automation.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class TextDemo {
public static void main(String[] args) throws IOException {
	
	File file = new File("H:\\javapractise\\frameworks\\src\\com\\saiteja\\automation\\supporters\\demo.txt");
	boolean status = file.createNewFile(); //whenever you call create new file method it checks the locations weather it is there or not and creates a file
	if (status) {
		System.out.println("File is created newly");		
	}
	else {
		System.out.println("Returns existing file!");
	}
	
	FileReader fileReader = new FileReader(file);
	BufferedReader bufferedReader = new BufferedReader(fileReader);
	
	 while(bufferedReader.ready()) // in buffer reader class we have method called ready() it will checks if the data is there it will retur to end of that
	 {
		 String data = bufferedReader.readLine();// if the data is there we can get data through readline() method
		 System.out.println(data);
	 }
	
	
	// I WANT TO WRITE THE DATA TO THAT FILE.
	//BUT ITS NOT POSSIBLE TO WRITE DATA DIRECTLY TO THAT FILE.
	//IN ORDER TO WRITE  THE DATA TO THAT FILE WE HAVE PREDEFINED CLASS FILEWRITER
	//FileWriter fw = new FileWriter(file);
	FileWriter fw = new FileWriter(file,true); //Here im writing boolean append = true
	BufferedWriter bw = new BufferedWriter(fw); //directly we cannot communicate through buffers we can
	
	bw.write("hello");//writing the data to buffer
	bw.newLine();
	bw.write("java");
	bw.newLine(); // by this method text will get in a new line
	bw.write("selenium");
	bw.newLine();
	bw.write("job");
	bw.newLine();
	
	
	//here now we want to move the data from buffer to file
	
	bw.flush(); //by calling flush all data from buffer to file will be moved.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
