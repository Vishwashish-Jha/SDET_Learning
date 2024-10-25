package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;
	
	public ReadConfig() throws Exception  {

		FileInputStream fs = new FileInputStream("./config.properties");
		prop = new Properties();
		prop.load(fs);
	
	}
	
	public String getBrowser()
	{
		return prop.getProperty("browser");
		
	}
	
	public String getappURL()
	{
		return prop.getProperty("appURL");
		
	}
	
}
