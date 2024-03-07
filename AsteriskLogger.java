package week05;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
		String newLog = "***" + log + "***";
			
		System.out.println(newLog);
	}

	@Override
	public void error(String error) {
		System.out.println("******************");
		System.out.println("***Error: " + error + "***");
		System.out.println("******************");
		
	}
	
	

}
