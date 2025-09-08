package Week05Assignment;

public class SpacedLogger implements Logger {
	@Override
	public void log(String Message){
		StringBuilder spacedMessage = new StringBuilder();
		for(int i = 0;i<Message.length();i++) {
			spacedMessage.append(Message.charAt(i));
			spacedMessage.append(" ");
			
		}
		// the toString() isn't required but is considered good practice.
		System.out.println(spacedMessage.toString());
	}
	@Override
	public void error(String Message) {
		StringBuilder spacedMessage = new StringBuilder();
		for(int i = 0; i<Message.length();i++) {
			spacedMessage.append(Message.charAt(i));
			spacedMessage.append(" ");
		}
		System.out.println("Error: " + spacedMessage.toString());
	}

}
