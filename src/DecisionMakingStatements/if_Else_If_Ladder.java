package DecisionMakingStatements;

public class if_Else_If_Ladder {

	public static void main(String[] args) {
		String city = "Faridabad";
		
		if(city == "Agra" ) {
			System.out.println("City name is Agra");
		}
		else if(city == "Faridabad") {
			System.out.println("City name is Faridabad");
		}
		else if(city == "Ahemdabad") {
			System.out.println("City name is Ahemdabad");
		}
		else {
			System.out.println("City name not found");
		}

	}

}
