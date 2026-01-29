package loopStatements;
import java.util.Scanner;
public class Password_Check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String password = "";
		
		while(!password.equals("pass1234")) {
			System.out.println("Enter Password: ");
			password = sc.nextLine();
		}
		System.out.println("Access Granted.");
		sc.close();

	}

}
