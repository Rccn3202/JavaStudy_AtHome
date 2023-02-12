package Other.Ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SalesExample {

   public static void main(String[] args) {
      // 
      List<Sales> list = new ArrayList<>();
      
      list.add(new Sales("4��3��", "BC103", "������", 230, 276000, "3470-1234"));
      list.add(new Sales("4��5��", "BL203", "���ʱ�", 150, 680000, "3470-2200"));
      list.add(new Sales("4��8��", "AC103", "���ı�", 270, 324000, "3470-3300"));
      list.add(new Sales("4��12��", "DU103", "��걸", 350, 420000, "3470-4321"));
      
      
      
      System.out.println("��������" +"\t" + "�ŷ�ó�ڵ�" +"\t" + "��������" +"\t" + "�Ǹŷ�" +"\t" +"����ݾ�" +"\t" + "����ó");
      System.out.println("-----------------------------------------------------");
      for (int i = 0; i<list.size(); i++) {
         Sales s = list.get(i);
         
         System.out.println(s.getSaleDate() +"\t" + s.getCode() +"\t" + s.getLocation()
         + "\t" + s.getSaleAmount() +"\t" + s.getSaleMoney() +"\t" + s.getPhone());
      }
      System.out.println("------------------------------");
      System.out.println(" ");
      
      
      //������� ���� ���� �ŷ�ó �ڵ带 ���
      int max = 0; //���ؼ� �� ū ���� ���� ����
      int maxIndex = 0; //�ε����� ����� ���� ����, ������� ���� ���� �ŷ�ó�� �ε����� ����
      
      for (int i =0; i<list.size(); i++) {
         if (max < list.get(i).getSaleMoney()) {
            max = list.get(i).getSaleMoney();
            maxIndex = i;
         }
      }
      System.out.println("�ְ� �����: " + list.get(maxIndex).getSaleMoney());
      System.out.println("�ŷ�ó �ڵ�: " + list.get(maxIndex).getCode());
      System.out.println("------------------------------");
      System.out.println(" ");
      
      
      
      //�Ǹŷ��� ���� ���� ��������, �ŷ�ó�ڵ�, �Ǹŷ��� ���
      int min = 999999999;
      int minIndex = 0;
      
      for (int i =0; i<list.size(); i++) {
         if (min > list.get(i).getSaleAmount()) {
            min = list.get(i).getSaleAmount();
            minIndex = i;
         }
      }
      System.out.println("���� �Ǹŷ�: " + list.get(minIndex).getSaleAmount());
      System.out.println("��������: " + list.get(minIndex).getSaleDate());
      System.out.println("�ŷ�ó �ڵ�: " + list.get(minIndex).getCode());
      System.out.println("------------------------------");
      System.out.println(" ");
      
      
      
      
      
      
      
      //�ŷ�ó �ڵ带 �Է��ϸ� ���������� ����ó�� ���
      
      Scanner sc = new Scanner(System.in);

      boolean flag = true;
      
      while (flag) {
         
         boolean searchOk = false;

         String code = sc.nextLine();
         for (int i = 0; i < list.size(); i++) {
            System.out.print("�ŷ�ó �ڵ� �Է� > ");
            

            if (list.get(i).getCode().equals(code)) {
               System.out.println("�������� : " + list.get(i).getLocation());
               System.out.println("����ó : " + list.get(i).getPhone());
               searchOk = true;

               System.out.print("�� �˻��Ͻðڽ��ϱ�?(Y/N) > ");
               String choice = sc.nextLine();
               if (choice.equalsIgnoreCase("Y"))
                  flag = true;
               else if (choice.equalsIgnoreCase("N")) {
                  System.out.println("���α׷� ����");
                  flag = false;
                  break;
               }

            }

         }
         if (!searchOk)
            System.out.println(searchOk + "�ڵ�� ���� �ڵ��Դϴ�.");
   
         
      }

      

   }

}


/*
 * while������ ��� �Է��� �ް������� Y�Է��ϰ� ���� �ŷ�ó �ڵ� �Է� > �κ��� �ι��� ��µǴµ� �ذ��� �ȴ뼭...
 * �ŷ�ó �ڵ� �Է� > BC103
�������� : ������
����ó : 3470-1234
�� �˻��Ͻðڽ��ϱ�?(Y/N) > Y
�ŷ�ó �ڵ� �Է� > AC103
�ŷ�ó �ڵ� �Է� > AC103
�������� : ���ı�
����ó : 3470-3300
-
�Է¹޴°� ���� ������ ��������
�Ʊ�� for ���ȿ� �־ i�� 0�� �� �Է¹ް�, �ؿ��� �� 0���� �����ǰ� ���ƿ� �׷��� �ƹ��͵� �ȳ����ϱ� �ٽ� ó������ ���ư��� �Է����϶�� �����°ſ���
boolean searchOk = false;
         
         System.out.print("�ŷ�ó �ڵ� �Է� > ");
         String code = sc.nextLine();
         
         for (int i = 0; i < list.size(); i++) {

if (!searchOk)
            System.out.println(code + "�ڵ�� ���� �ڵ��Դϴ�.");


 */