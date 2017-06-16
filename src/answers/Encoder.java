package answers;

public class Encoder {

	final static String message = "WELL DONE!!!";
	static char[] text = message.toCharArray();
	/* The key for unlocking the message */
	final static int key = 5;
	
	public static void main(String[] args) {
		for (char character : text) {
			System.out.println((int)(character - key));
		}
	}
}
