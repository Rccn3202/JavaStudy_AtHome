package chap11_Exception.sec06;

public class Account {
	private long balance;  //�ʵ� ����
	
	public Account() { }   //������
	
	public long getBalance() {  //balance���� private�̹Ƿ� �ܺο����� ���� �� �ֵ��� getBalance�޼ҵ� �ۼ�(getter)
		return balance;
	}
	
	public void deposit(int money) {
		balance+=money;
	}
	
	public void withdraw(int money) throws InsufficientException {
		if(balance<money) {    //�ܰ�����̸� ���ܸ� �߻���Ű��, �׸��� ���ܸ� ������
			throw new InsufficientException("�ܰ����: "+(money-balance)+" ���ڶ�");
		}
		balance-=money;
	}
}
