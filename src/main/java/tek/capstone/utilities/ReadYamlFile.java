package tek.capstone.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.yaml.snakeyaml.Yaml;



public class ReadYamlFile {
	
	
		private static ReadYamlFile  readYamlFiles;
		private HashMap propertyMap;
		
		
		private ReadYamlFile (String filePath) throws FileNotFoundException {
			FileInputStream fileInputStream = FileUtility.getFileInputStream(filePath);
			Yaml yaml = new Yaml();
			this.propertyMap =yaml.load(fileInputStream);
		}
		
		
		public HashMap getYamlProperty(String key) {
			return (HashMap) this.propertyMap.get(key);
		}
		
		// this method checks if there is an instance of a class or not
		public static ReadYamlFile getInstance(String filePath) throws FileNotFoundException {
			if(readYamlFiles == null)
				return new ReadYamlFile(filePath);
			return readYamlFiles;
			
		}
	
	
	
	
	
	
	
	
}
