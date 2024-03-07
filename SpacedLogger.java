package week05;

public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		
		String spaces = "";
		for (int i = 0; i <log.length(); i++) {
			char newChar = log.charAt(i);
			spaces += newChar + " ";
		}
		System.out.println(spaces);
		}
		
		
	
	

	@Override
	public void error(String error) {
		
		String spaces = "";
		for (int i = 0; i <error.length(); i++) {
			char newChar = error.charAt(i);
			spaces += newChar + " "; 
		}
		System.out.println("Error: " + spaces);
	
	

	}
}
