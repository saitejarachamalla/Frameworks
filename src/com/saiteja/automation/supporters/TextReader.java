package com.saiteja.automation.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextReader {

	private String filepath;
	private File file;
	private FileReader fileReader;
	private BufferedReader bufferedReader;
	private FileWriter fw;
	private BufferedWriter bw;
	
	public TextReader(String filepath) throws IOException 
	{
		this.filepath = filepath;
		file = new File(filepath);
		boolean status = file.createNewFile(); //whenever you call create new file method it checks the locations weather it is there or not and creates a file
		if (status) {
			System.out.println("File is created newly");		
		}
		else {
			System.out.println("Returns existing file!");
		}
		
		fileReader = new FileReader(file);
		bufferedReader = new BufferedReader(fileReader);
		fw = new FileWriter(file,true); //Here im writing boolean append = true
		bw = new BufferedWriter(fw); //directly we cannot communicate through buffers we can
			
	}
	
	public void writeData(int data) throws IOException
	{
		if(bw!=null) {
			bw.write(data);
			bw.flush();
		}
		else {
			//throw exception
			System.out.println("BW IS POINTING TO NULL");
		}
	}
	
	
	public void writeData(String data) throws IOException
	{
		if(bw!=null) {
			bw.write(data);
			bw.flush();
		}
		else {
			//throw exception
			System.out.println("BW IS POINTING TO NULL");
		}
	}
	
	//to write group of data
	public void writeData(List<String> data) throws IOException
	{
		if(bw!=null) {
			for(String str: data) {
			bw.write(str);
			bw.flush();
			}
		}
		else {
			//throw exception
			System.out.println("BW IS POINTING TO NULL");
		}
	}
	
	//i want to get data. There may be a chance of existing duplicate data thatsy we use list
	public List<String> getTotalFileData() throws IOException {
		List<String> fileData = new ArrayList<String>();
		if (bufferedReader!=null) {
			while(bufferedReader.ready()) {
				String data = bufferedReader.readLine();
				fileData.add(data);
			}
		}
		else {
			//throw exception
			System.out.println("BW IS POINTING TO NULL");
		}
		return fileData;
	}

	
}
