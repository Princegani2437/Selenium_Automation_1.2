package generic_utility;

import java.io.FileInputStream;
import java.util.Properties;
/**
 * @author Ganesh N Bhat
 */
public class File_utility {
/**
 * This method used read data from Property file by taking KEY from the caller
 * @param key
 * @return value
 * @throws Exception
 */
	public String getDataFromproperty(String key) throws Exception {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/commondata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}
}
