package loopStatements;

public class Login_Attempt {

	public static void main(String[] args) {
		int attempted = 1;
		
		while (attempted <= 3) {
			System.out.println("Attempt" + attempted + " :Trying to Login");
			attempted++;
		}
		System.out.println("Account Locked!");

	}

}
