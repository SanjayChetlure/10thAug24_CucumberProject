package LibraryFiles;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass 
{
	public static String getPFData(String key) throws IOException 
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\LibraryFiles\\PropertyFile.properties");
		
		Properties p=new Properties();
		p.load(file);
		
		String value = p.getProperty(key);
		
		return value;
	}
}
