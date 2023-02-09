package chap11_Exception.sec06;
//예외 발생 시키기
public class AccountEx {

	public static void main(String[] args) {
		Account account=new Account();
		
		//예금하기
		account.deposit(10000);
		System.out.println("예금액: "+account.getBalance());

		//출금하기
		try {
			account.withdraw(30000);
		} catch(InsufficientException e){
			String message=e.getMessage();	//예외 왜 발생했는지 알아보고, 출력(println)
			System.out.println(message);
		}
	}
}


