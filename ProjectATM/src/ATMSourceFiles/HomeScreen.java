package ATMSourceFiles;

public class HomeScreen implements HomePage{
	
	public static void main(String s[]) {
		HomeScreen HS = new HomeScreen();
		HS.homeScreen();
		
	}
	
	@Override
	public void homeScreen() {
		System.out.println("\t\t Welcome to Apollo's ATM \n\nPlease Enter Your Details Here \n");
		Home_Interface HI = new Home_Interface();
		HI.User_Details();
	}

	@Override
	public void BalanceCheck() {
	
	}

	@Override
	public void Deposit() {
		
	}

	@Override
	public void Withdrawal() {
		
	}
}
