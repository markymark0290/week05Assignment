package week05;

public class App {

	public static void main(String[] args) {
		
		Logger aLog = new AsteriskLogger();
		String str = "Hello";
		
			aLog.log(str);
				System.out.println();
				
			aLog.error(str);
				System.out.println();
		
		Logger sLog = new SpacedLogger();
		
			sLog.log(str);
				System.out.println();
				
			sLog.error(str);
		
	}
	
}
