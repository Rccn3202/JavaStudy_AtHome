package chap16_LambdaExpressions.sec02;

public class Button {
	//���� ��� �������̽�. �Լ�����
	@FunctionalInterface
	public static interface ClickListener {
		//�߻� �޼ҵ�
		void onClick();
	}
	
	//�ʵ�
	private ClickListener clickListener;
	
	//�޼ҵ�
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
}
//��ư�� Ŭ�������� � ���� �Ͼ������ �̰͸� ������� ��
//�ܺο��� ��ư ������ ��� �Ǵ����� ClickListener ������ü�� ���� clickListener�� �־��־���Ѵ�