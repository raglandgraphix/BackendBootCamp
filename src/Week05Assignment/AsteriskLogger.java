package Week05Assignment;

public class  AsteriskLogger implements Logger {
	@Override
	public void log(String Message) {
		System.out.println("***"+ Message+ "***");
	}
	@Override
    public void error(String message) {
        String errorMessage = "ERROR: " + message;
        int length = errorMessage.length();
        StringBuilder border = new StringBuilder();
        for (int i = 0; i < length + 6; i++) {
            border.append("*");
        }
        System.out.println(border.toString());
        System.out.println("***" + errorMessage + "***");
        System.out.println(border.toString());
    }
	
}

