package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//when  web application automate i want to all webelements of webobjects
	//	FileInputStream fis =new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\BasicOfjava\\src\\FileHandling\\Propertyfile.properties");
		FileOutputStream fis =new FileOutputStream("C:\\Users\\Administrator\\eclipse-workspace\\BasicOfjava\\src\\FileHandling\\Propertyfile.properties");

		Properties prop=new Properties();
prop.setProperty("name", "ms Dhoni");
prop.setProperty("comapany", "IBM");
prop.setProperty("role", "software");
prop.store(fis,"About dhoni");



	//	prop.load(fis);		
		//System.out.println(prop.getProperty("url"));
		//System.out.println(prop.getProperty("browser"));
		//System.out.println(prop.getProperty("password"));
		//load is property method
	//propertiesinbuilt class in a 

		
		
		
		
}
}