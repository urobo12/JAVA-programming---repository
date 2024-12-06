package ch13;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.depostit(10000);
		System.out.println("¿¹±Ý¾×: " + account.getBalance());

		try {
			account.withdraw(3000);
		}catch(InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	}

}
