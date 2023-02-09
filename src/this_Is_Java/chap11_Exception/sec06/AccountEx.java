package chap11_Exception.sec06;
//���� �߻� ��Ű��
public class AccountEx {

	public static void main(String[] args) {
		Account account=new Account();
		
		//�����ϱ�
		account.deposit(10000);
		System.out.println("���ݾ�: "+account.getBalance());

		//����ϱ�
		try {
			account.withdraw(30000);
		} catch(InsufficientException e){
			String message=e.getMessage();	//���� �� �߻��ߴ��� �˾ƺ���, ���(println)
			System.out.println(message);
		}
	}
}


