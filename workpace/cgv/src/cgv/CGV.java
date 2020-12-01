package cgv;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Random;

public class CGV {
	public static void main(String[] args) {
		//���
		final String title = "�ƢƢ� CGV �ƢƢ�";
		String msg = "1.�����ϱ�\n2.�����ϱ�\n3.����Ʈ ��ȸ\n4.�������\n5.�ŷ�����\n6.������";
		String film_msg = "1.�ܿ�ձ�(09:00)\n2.�ܿ�ձ�2(12:00)\n3.[û�ҳ� ���� �Ұ�]Ÿ¥(23:00)\n4.���ư���";
		String food_msg = "1.����(��7000)\n2.�ݶ�(��4000)\n3.[û�ҳ� ���� �Ұ�]����ī��(��5000)\n4.���ư���";
		String pay_msg = null;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String payList = "";
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		//100000~999999
		//0 ~ 899999 + 100000 
		int coupon = r.nextInt(900000) + 100000;
		
		int p_price = 7000;
		int c_price = 4000;
		int b_price = 5000;
		
		String err_msg = "�ٽ� �õ����ּ���";
		
		int point = 0;
		int choice = 0;
		int money = 1_000_000;
		
		String time = null;
		
		int t_price = 10000;
		int age = 0;
		
		String name = null;
		
		int price = 0;
		int myCoupon = 0;
		
		//Flag
		//�ش� �������� ��� ������ �����Ǳ� ���� ������ ǥ�ø� �ϰ� ���ͼ� ������ �ϼ���Ű���� �����ش�.
		//�ش� ������ ���Դ��� �ȵ��Դ����� Flag�� ����ִ� ������ �Ǵ��� �� �ִ�.
		boolean isPoint = false;
		boolean isPopcorn = false;
		boolean couponCheck = false;
		
		while(true) {
			//�����ڰ� Ȯ���ϱ� ���ؼ� �߱޵� ������ȣ�� ����ϰ�, ��� �� ����� �����ش�.
			System.out.println("������ȣ : " + coupon);
			//����Ʈ ���� ���������� �Ǵ��ϱ� ���� �Ź� false�� �ʱ�ȭ ���ش�.
			isPoint = false;
			//������ �����ߴ����� �Ǵ��ϱ� ���ؼ��� �Ź� false�� �ʱ�ȭ �ؾ��Ѵ�.
			isPopcorn = false;
			System.out.println(title);
			System.out.println(msg);
			choice = sc.nextInt();
			
			//������
			if(choice == 6) { break;}
			
			switch(choice) {
			//����
			case 1:
				System.out.println(film_msg);
				//������ ����
				//1. �޸� ȿ�� ����
				//2. �������� ���� �ʴ�.
				choice = sc.nextInt();
				switch(choice) {
				//�ܿ�ձ�(9��)
				case 1:
					//�ϴܿ��� �ϰ�ó���� �ϱ� ������ ����ڰ� ������ ��ȭ�� � ��ȭ������
					//name�� ��� �������� ������ش�.
					name = "�ܿ�ձ�(9��) ����";
					break;
				//�ܿ�ձ�2(12��)
				case 2:
					name = "�ܿ�ձ�2(12��) ����";
					break;
				//Ÿ¥(23��)
				case 3:
					System.out.print("���� : ");
					age = sc.nextInt();
					//�̼��������� �ƴ��� �˻�
					if(age <= 19) {
						//�̼������� ���
						
						//�̼����ڷ� �ŷ� �������� ���� �ð�
						time = sdf.format(System.currentTimeMillis());
						//�ŷ� ������ ǥ���ϱ� ���� payList�� ���������� ���ش�.
						payList += "Ÿ¥(23��) ���� ���� / �̼����� ���� �Ұ� /"+ time + "\n";
						System.out.println("�̼����� ���� �Ұ� ��ȭ�Դϴ�.");
						//������ �������� �ʰ� ���� �ݺ�(Ȩȭ��)
						continue;
					}
					name = "Ÿ¥(23:00) ����";
					break;
				//���ư���
				case 4:
					continue;
				//�� ��
				default:
					System.out.println(err_msg);
					continue;
				}
				//���������� ��ȭ�� �������� �� ���� ����
				//price�� ��ȭǥ ������ ����ش�.
				price = t_price;
				break;
			//����
			case 2:
				System.out.println(food_msg);
				choice = sc.nextInt();
				switch(choice) {
				//����
				case 1:
					name = "���� ����";
					//��ǰ���� ������ �ٸ��� ������
					//����ڰ� ������ ��ǰ�� ������ ���� price�� ����ش�.
					price = p_price;
					isPopcorn = true;
					break;
				//�ݶ�
				case 2:
					name = "�ݶ� ����";
					price = c_price;
					break;
				//����
				case 3:
					System.out.print("���� : ");
					age = sc.nextInt();
					if(age <= 19) {
						time = sdf.format(System.currentTimeMillis());
						payList += "���� ���� ���� / �̼����� ���� �Ұ� /"+ time + "\n";;
						System.out.println("�̼����� ���� �Ұ� ��ǰ�Դϴ�.");
						continue;
					}
					name = "���� ����";
					price = b_price;
					break;
				//���ư���
				case 4:
					continue;
				//�� ��
				default:
					System.out.println(err_msg);
					continue;
				}
				break;
			//����Ʈ
			case 3:
				System.out.println("�ܿ� ����Ʈ : " + point + "��");
				continue;
			//����
			case 4:
				//�̹� ������ ������ ����ڶ�� couponCheck�� true�� ����ִ�.
				if(!couponCheck) {
					//������ �������� �ʾ��� �� ����
					System.out.print("������ȣ 6�ڸ� : ");
					myCoupon = sc.nextInt();
					if(coupon == myCoupon) {
						//����ڰ� �Է��� ������ȣ�� ȸ���� ������ȣ�� ���Ͽ�
						//��ġ���� �� couponCheck�� true�� �������ش�.
						couponCheck = true;
					}else {
						//�߸��� ������ȣ�� �Է����� ��
						System.out.println("�߸��� ������ȣ�Դϴ�.");
					}
				}else {
					//������ �̹� ������ ������� ��
					System.out.println("�̹� ����� ������Դϴ�.");
				}
				continue;
			//�ŷ�����
			case 5:
				//���� �ŷ������� ���ٸ� ���׿����ڷ� �Ǵ��Ͽ� ������ �޼����� ������ش�.
				System.out.println(payList.equals("") ? "�ŷ� ������ �����ϴ�." : payList);
				continue;
			//�� ��
			default:
				System.out.println(err_msg);
				continue;
			}
			//&&�����ڴ� ���� ���ǽ��� false�̸� ���� ���ǽ��� �˻����� �ʴ´�.
			//������ �����ϰ� ������, ������ �����ߴٸ� ����.
			if(couponCheck && isPopcorn) {
				//���� ���� �����̹Ƿ� ���� ������ 0���� ������ش�.
				price = 0;
				System.out.println("���� ���������� ���Ǿ����ϴ�.");
				//������ ����߱� ������ �� �̻� ���� �����ڰ� �ƴϴ�.
				//���� couponCheck�� false�� �ǵ����ش�.
				couponCheck = false;
				
				//���� ������ȣ�� temp�� ����ش�.
				int temp = coupon;
				//�ߺ��� ���� ������ ���� �ݺ�
				while(true) {
					//���ο� ������ȣ �߱�
					coupon = r.nextInt(900000) + 100000;
					//���� ������ȣ�� �� �� �ߺ��� �ƴϸ� Ż��
					//�ߺ��̸� ���ѹݺ�
					if(temp != coupon) {break;}
				}
				continue;
			}
			
			//�ϰ�ó��
			//����Ʈ�� ������ ��� ���ؼ� ��ǰ�� ������ �� �ִ� �� �˻�
			if(money + point - price < 0) {
				//�ܾ׺���
				time = sdf.format(System.currentTimeMillis());
				payList += name + "  ���� / �ܾ׺��� /"+ time + "\n";
				System.out.println(name + "  ���� / �ܾ׺���");
			}else {
				//�������
				//����Ʈ�� 1���̶� �ִٸ� �ڵ� ���
				if(point > 0) {
					if(point - price < 0) {
						//����Ʈ�� ��ǰ�� ������ �� ���� ��
						//����Ʈ + ���� ����
						money -= price - point;
						point = 0;
						pay_msg = "����Ʈ + ����";
					}else {
						//����Ʈ ���� ����
						point -= price;
						pay_msg = "����Ʈ";
						isPoint = true;
					}
				}else {
					//���� ���� ����
					money -= price;
					point += price * 0.5;
					pay_msg = "����";
				}
				time = sdf.format(System.currentTimeMillis());
				payList += name + "  �Ϸ� / " + pay_msg + " ����/"+ time + "\n";
				System.out.println(name + "  �Ϸ� / " + pay_msg + " ����");
				
				if(!isPoint) {
					//isPoint�� true��� ���� ����Ʈ �����̱� ������
					//���� �ܾ��� ����� �ʿ䰡 ����.
					//���� isPoint�� false�� ������ ���� �ܾ��� ����Ѵ�.
					System.out.println("���� �ܾ� : " + money + "��");
				}
			}
			
		}
	}
}







