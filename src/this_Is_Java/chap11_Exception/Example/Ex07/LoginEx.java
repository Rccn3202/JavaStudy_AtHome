package chap11_Exception.Example.Ex07;
/*
 * 존재하지 않는 ID 입력하면 예외 발생, 존재하지 않는 비밀번호 입력시 예외 발생
 * > 예외 발생시키기
 */
public class LoginEx {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} 
		
		try {
			login("blue", "54321");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		//id가 blue가 아니라면 NotExistIDException 발생
		if(!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않음");
		}
		//password가 12345가 아니라면 WrongPasswordException 발생
		if(!password.equals("12345")) {
			throw new WrongPasswordException("패스워드가 틀림");
		}
	}
	
	

}
