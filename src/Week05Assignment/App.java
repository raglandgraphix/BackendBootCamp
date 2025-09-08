package Week05Assignment;

public class App {

	public static void main(String[] args) {
		 Logger asteriskLogger = new AsteriskLogger();
	     Logger spacedLogger = new SpacedLogger();

	        // Test AsteriskLogger
	        System.out.println("AsteriskLogger Tests:");
	        asteriskLogger.log("Hello, world!");
	        asteriskLogger.error("This is an error.");

	        System.out.println("\n-------------------------\n");

	        // Test SpacedLogger
	        System.out.println("SpacedLogger Tests:");
	        spacedLogger.log("Hello, world!");
	        spacedLogger.error("This is another error.");

	}

}
