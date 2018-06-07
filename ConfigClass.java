package configTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigClass {

	public static String GetInputInfo(String Filenm) throws Exception {

		Properties prop = new Properties();

		FileInputStream input = new FileInputStream(Filenm);
		prop.load(input);
		String purl = prop.getProperty("url");
		String puserid = prop.getProperty("username");
		String ppassword = prop.getProperty("password");
		String ph1 = prop.getProperty("excel");

		String retrec = puserid + "," + ppassword + "," + ph1 + "," + purl;
		return retrec;

	}

}
