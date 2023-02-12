package chap11_Exception.sec06;

public class Account {
	private long balance;  //필드 선언
	
	public Account() { }   //생성자
	
	public long getBalance() {  //balance값이 private이므로 외부에서도 읽을 수 있도록 getBalance메소드 작성(getter)
		return balance;
	}
	
	public void deposit(int money) {
		balance+=money;
	}
	
	public void withdraw(int money) throws InsufficientException {
		if(balance<money) {    //잔고부족이면 예외를 발생기키자, 그리고 예외를 던진다
			throw new InsufficientException("잔고부족: "+(money-balance)+" 모자람");
		}
		balance-=money;
	}
}
