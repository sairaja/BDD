package Utility;

import java.util.Properties;
import java.io.*;


public class Util {


	public String getproperty(String Key) throws IOException{
		
		String CurrentDir,Folder,path;
		
		CurrentDir =System.getProperty("user.dir");
		Folder = "\\Properties\\";
		
		path = CurrentDir+Folder+"config.properties";
		
		System.out.println(path);
		
		Properties props = new Properties();
		FileReader reader = new FileReader(path);
		props.load(reader);
		
		String prop = null;
		
		prop = props.getProperty(Key);
		
		return prop;
		
	}
	
	
	public void wait(int seconds) throws InterruptedException{
		
		
		for (int i = 0; i < seconds; i++) {
			
			System.out.println(i+1);
			Thread.sleep(1000);
		}
		
	}
}
