import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Validator {

	public static void main(String[] args) {
		
		openFile(args[0]);
		
		
		
	}
	
	
	private static void openFile(String fileName) {
		
		File emails =  new File(fileName);
		FileInputStream emailsImput;
		try {
			emailsImput = new FileInputStream(emails);
			BufferedReader emailReader = new BufferedReader(new InputStreamReader(emailsImput));
		} catch (FileNotFoundException e) {
			System.out.println("File not found" + e.getMessage());
		}
		
	}
	
	
	private boolean validate (String email) {
		
		return true;
	}

}
