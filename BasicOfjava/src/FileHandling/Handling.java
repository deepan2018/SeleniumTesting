package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Handling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method st
		FileReader file = new FileReader("D:\\Filehandling\\Selenium.txt");
		
		
		//FileWriter file = new FileWriter("D:\\Filehandling\\Selenium.txt",true);

		//BufferedWriter buf = new BufferedWriter(file);
		BufferedReader buf = new BufferedReader(file);
		System.out.println(buf.readLine());
		System.out.println(buf.readLine());
		System.out.println(buf.readLine());
		
		//if u want all data from notepad file using loop
		String x="";
		while((x=buf.readLine())!=null)
		{
			System.out.println(x);
		}
		//buf.write("welcome to Selenium testing");
		//buf.newLine();
		//buf.write("welcome to JavaSelenium");
		//buf.newLine();
		//buf.write("jmeter");
		//buf.newLine();
		//buf.write("appium");
		//buf.newLine();
		//buf.write("Protector");
		//buf.newLine();
		//buf.close();
		//System.out.println("sucess");
	//create a Simple file in specified Location	
//File f = new File("D:\\Filehandling\\Selenium.java");
//f.createNewFile();

	}

}
