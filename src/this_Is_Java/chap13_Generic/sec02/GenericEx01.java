package chap13_Generic.sec02;

public class GenericEx01 {

	public static void main(String[] args) {
		//K�� Tv�� ��ü, M�� String���� ��ü
		Product<Tv, String> product1 = new Product<>();
		
		//Setter �Ű����� �ݵ�� Tv�� String�� ����
		product1.setKind(new Tv());
		product1.setModel("����ƮTv");
		
		//Getter ���ϰ��� Tv�� String�� ��
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		//----------------------------------------------------
		//K�� Car�� ��ü, M�� String���� ��ü
		Product<Car, String> product2 = new Product<>();
		
		//Setter �Ű����� �ݵ�� Car�� String�� ����
		product2.setKind(new Car());
		product2.setModel("SUV�ڵ���");
		
		//Getter ���ϰ��� Car�� String�� ��
		Car car = product2.getKind();
		String carModel = product2.getModel();

	}

}
