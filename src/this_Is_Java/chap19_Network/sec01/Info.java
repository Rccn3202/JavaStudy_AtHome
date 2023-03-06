package chap19_Network.sec01;

public class Info {
/* 19.1 네트워크 기초
 * 
 * LAN(local area network) : 가정,회사,건물, 특정 영역에 존재하는 컴퓨터 연결
 * WAN(wide area network) : LAN을 연결한 것(WAN이 인터넷)
 * 
 * 서버와 클라이언트
 * -서버 : 서비스를 제공
 * -클라이언트 : 서비스를 요청
 * 순서 : 클라이언트가 서버에 연결요청-서버가 처리-서버가 클라이언트에게 처리요청
 * 
 * IP주소
 * :컴퓨터의 고유한 주소. 네트워크 어댑터(LAN카드)마다 할당된다
 * 컴퓨터에 두 개의 네트워크 어댑터가 장착되어 있다면 두 개의 IP주소 할당받을 수 있다
 * 윈도우는 cmd에 ipconfig를 입력하면 IP확인할 수 있다
 * DNS(domain name system):도메인 이름. IP를 등록하는 저장소. www.naver.com 등등. 서버
 * 
 * 최소한 DNS와 IP는 설정되어있어야함
 * 
 * Port번호
 * :서버프로그램을 실행하려면 필요
 * 프로그램: 웹 브라우저/FTP클라이언트/DB클라이언트
 * 클라이언트와 네트워크 어댑터를 연결하는 것은 IP
 * 컴퓨터 안의 운영체제와 네트워크 어댑터를 연결하려면 포트번호 필요(고유 식별번호)
 * 운영체제가 부여해준다.
 * 보통 웹서버의 포트번호는 80(바꿀 수 있음)
 * FTP:파일서버. 파일저장,다운. 보통 21
 * DBMS:데이터베이스. 고정 포트번호는 없음.
 * 클라이언트도 프로그램이지만 클라이언트는 명시적으로 포트번호를 부여하지 않는다. 매번 달라지는 포트번호 사용
 * 포트번호 범위:0~65535(2바이트로 표현할 수 있는 최대 범위)
 * Well know port numbers 0~1023 : 공통적으로 사용되는 잘 알려진 프로그램
 * registered port numbers 1024~49151 : 회사에서 등록해서 사용하는 프로그램. 번호 쓰려면 돈 내야함
 * dynamic of private port numbers 49152~65535 : 개인적으로 사용하는 프로그램.상용X. 연습,테스트용
 * 
 * 
 * 
 */
	
}
