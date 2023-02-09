package chap11_Exception.Example.Ex07;

public class NotExistIDException extends Exception {
	public NotExistIDException() { }
	public NotExistIDException(String message) {
		super(message);
	}
}
