package chap18_DataInputOutput.sec02;

public class Info {
/* 18.2 바이트 출력 스트림
 * 최상위클래스 OutputStream은 객체를 생성하지 않고, 이 클래스를 상속받은 클래스를 이용한다
 * 
 * OutputStream 클래스의 주요 메소드
 * void write(int b) : 1바이트를 출력
 * void write(byte[] b) : 매개값으로 주어진 배열 b의 모든 바이트를 출력
 * void write(byte[] b, int off, int len) : 매개값으로 주어진 배열b[off]부터 len개의 바이트 출력
 * void flush() : 출력 버퍼에 잔류하는 모든 바이트를 출력(write는 출력X, 출력 준비. 실제 출력은 flush)
 * void close() : 출력 스트림을 닫고 사용 메모리 해제
 * 
 * 1) 1 바이트 출력
 * write(int b) 메소드는 매개값 int(4byte)에서 끝 1byte만 출력한다
 * int타입으로 받지만 실제 출력은 1바이트만 한다
 * 
 * 2) 바이트 배열 출력
 * write(byte[] b)
 * 여러 데이터를 바이트 배열에 넣어서 한번에 출력할 수 있다
 * 
 * 
 * 
 */
}
