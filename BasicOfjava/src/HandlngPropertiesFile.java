import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class HandlngPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\BasicOfjava\\src\\HandlngPropertiesFile.java");
Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("username	"));

	}

}
