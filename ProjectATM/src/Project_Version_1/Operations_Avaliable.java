package Project_Version_1;

import java.util.Scanner;

public class Operations_Avaliable extends User_Credentials {
	
	
	

	
	public void Operations(String account_Number) {
		String UserId = account_Number;
		User_Credentials UC = new User_Credentials();
		Scanner in = new Scanner(System.in);
		System.out.print("\n\nOperation -> 1. BitCoin Withdrawal  \n             "
				+ "2. BitCoin Deposit     \n             "
				+ "3. Account Balance  \n             "
				+ "4. Exit             \n\n           "
				+ "Enter Your Option : ");
		int Option = in.nextInt();
		
		
		switch(Option) {
		
		case 1: System.out.println("\n\nBitCoin Withdrwal");
				System.out.print("Enter Number of Bitcoins to Withdraw : ");
		        float Withdraw =in.nextFloat();
		        if(Withdraw <= 1000.0) {
					Boolean resultss = UC.Withdraw(UserId ,Withdraw);
					if(resultss == true) {
						 UC.Balance(UserId);
						System.out.println("Withdrawal of "+Withdraw+" Bitcoins Succesfully");

					}
					else {
						System.out.println("Withdrawal of "+Withdraw+" Bitcoins Not Succesfully");
					}
		        }else {
		        	System.out.println("Can't Handle More than 1000 BitCoins in Single Transation");
		        }
		        Operations(UserId);
				break; 
		        
		case 2: System.out.println("\n\nBitCoin Deposit");
					
				System.out.print("Enter Number of Bitcoins to Deposit : ");
				float Deposit =in.nextFloat();
				if(Deposit <= 1000.0) {
					Boolean resultsss = UC.Deposit(UserId ,Deposit);
					if(resultsss == true) {
						System.out.println("Deposit of "+Deposit+" Bitcoins Succesfully Added to Your Account");
						 UC.Balance(UserId);

					}
					else {
						System.out.println("Deposit of "+Deposit+" Bitcoins Not Succesfully Added");
					}
				}
				 Operations(UserId);
			    break;
	
		case 3: 
				Float Balance = UC.Balance(UserId);
				System.out.print("\n\nYour Bitcoin Balance : "+Balance);
				 Operations(UserId);
				break;
        
		case 4: System.out.println("\n\nThanks For Choosing Us ");
				System.exit(0);
				break;
		}
		
		in.close();
		
		
		
	}

	
}
