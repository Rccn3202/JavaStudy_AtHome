package chap14_MultiThread.sec03;

//�̱۽�����

import java.awt.Toolkit;

public class BeepPrintEx01 {
	
	public static void main(String[] args) {	//main������
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();	//Toolkit ��ü ���
		//java��Ű���� �ִ� Toolkit�� ������ ��ü toolkit�� ��ڴ�.
		//.~ : new�ؼ� ��ü�� ��� ���� �ƴ϶� �����޼ҵ带 ���ؼ� ���ϰ����� ��ڴ�.
		
		//�۾�1
		for(int i=0; i<5; i++) {
			toolkit.beep();								//������ �߻�(�̷��Ը� �ۼ��ϸ� �ʹ� ���� �ȵ鸲)
			try { Thread.sleep(500); } catch(Exception e) {}	//{ Thread.sleep(500); } : 0.5�ʰ� �Ͻ�����
		}
		
		//�۾�2
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try { Thread.sleep(500); } catch(Exception e) {}
		}

	}

}
