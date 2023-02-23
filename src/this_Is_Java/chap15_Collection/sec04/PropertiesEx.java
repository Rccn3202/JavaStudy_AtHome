package chap15_Collection.sec04;

import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) {
		//Properties �÷��� ����
		Properties properties = new Properties();
		
		//PropertiesEx.class�� ������ ClassPath�� �ִ� database.properties ���� �ε�
		properties.load(PropertiesEx.class.getResourceAsStream("database.properties));

		//�־��� Ű�� ���� �� �б�
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String usename = properties.getProperty("username");
		String password = properties.getProperty("password");
		String admin = properties.getProperty("admin");
		
		//�� ���
		System.out.println("driver : "+driver);
		System.out.println("url : "+url);
		System.out.println("username : "+username);
		System.out.println("password : "+password);
		System.out.println("admin : "+admin);
		
				
				
	}

}
