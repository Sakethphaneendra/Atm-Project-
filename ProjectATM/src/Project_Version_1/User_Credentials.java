package Project_Version_1;

public class User_Credentials  {
	
	String Account_Number_Id[]= {"22A35A4403","21A31A4424","9613544999","9704282666"};
	String Account_Password_Id[]= {"1233","1234","0000","151715"};
	Float Account_Balance[]= {5000.0f,2000.0f,8000.5f,10000.35f};

	public boolean UserVerfication(String UserId , String UserPassword) {

		for(int i=0;i<Account_Number_Id.length;i++) {
			if(Account_Number_Id[i].equals(UserId)) {
				if(Account_Password_Id[i].equals(UserPassword)) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	public Float Balance(String User) {
		
		 for(int i=0;i<Account_Number_Id.length;i++) {
		    	if(Account_Number_Id[i].equals(User)) {
		    		return Account_Balance[i];
		    	}
		    }
		    	return (float) 0;
		 }
		 
	
	public boolean Deposit(String User , float Deposit_Bitcoin) {
		User_Credentials UCC = new User_Credentials();
		
		 for(int i=0;i<Account_Number_Id.length;i++) {
		    	if(Account_Number_Id[i].equals(User)) {
//		    		Deposit the balance 
		    		UCC.Account_Balance[i]=Account_Balance[i] += Deposit_Bitcoin;
		    			;
		    			return true;
		    	}
		    }
		return false;
	}

	public boolean Withdraw(String User , float Withdraw_Bitcoin) {
		User_Credentials UCC = new User_Credentials();

	    for(int i=0;i<Account_Number_Id.length;i++) {
	    	if(Account_Number_Id[i].equals(User)) {
//	    		Checking the balance 
	    		if(Account_Balance[i]>=Withdraw_Bitcoin) {
		    		UCC.Account_Balance[i]=Account_Balance[i] -= Withdraw_Bitcoin;
	    			return true;
	    		}
	    		else {
	    			System.out.println("Insufficient Bitcoin Balance");
	    		}
	    	}
	    }
		
		return false;
	}


}
