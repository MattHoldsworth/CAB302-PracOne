package answers;

public class Question_1 {
	final static int[] message = { 82, 96, 103, 103, 27, 95, 106, 105, 96, 28 };
	/* The key for unlocking the message */
	final static int key = 5;
	
	public static void main(String[] args) {
		for (int number : message){
			System.out.println((char)(number + key));
		}
	}
}

		
