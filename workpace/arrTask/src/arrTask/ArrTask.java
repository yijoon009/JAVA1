package arrTask;

import java.util.Scanner;

public class ArrTask {
	public static void main(String[] args) {
		//�ڽ� ȸ��
		//������ ȫ���� ������
		//�Ϲ�
		//Ű��
		//
		//�� ������ �� �����, ��� �����
		//�� ���ɺ� �� �����, ��� �����
		//�ڽ� �� �����, ��� �����
		//
		//�ڽ� ��� ����׺��� ���� ����� ������ �μ�Ƽ�� �������� ���
			
		String[] arBranch = {"������", "ȫ����", "������"};
		String[] arAge = {"�Ϲ�", "Ű��"};
		
		int[][] arrIncome = new int[arBranch.length][arAge.length];
		int length = 0;
		
		int[] arBranchTotal = new int[3];
		int[] arAgeTotal = new int[2];
		
		double[] arBranchAvg = new double[3];
		double[] arAgeAvg = new double[2];
		
		int total = 0;
		double avg = 0.0;
		
		boolean bonusCheck = false;
		
		String bonusMsg = "";
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arrIncome.length; i++) {
			length += arrIncome[i].length;
			for (int j = 0; j < arrIncome[i].length; j++) {
				System.out.println(arBranch[i] + " " + arAge[j] + "���� ������� �Է��ϼ���(����:����)");
				arrIncome[i][j] = sc.nextInt();
				arBranchTotal[i] += arrIncome[i][j];
				arAgeTotal[j] += arrIncome[i][j];
				total += arrIncome[i][j];
			}
			arBranchAvg[i] = Double.parseDouble(
					String.format("%.2f", (double)arBranchTotal[i] / arrIncome[i].length));
		}
		
		for (int i = 0; i < arAgeAvg.length; i++) {
			arAgeAvg[i] = Double.parseDouble(
					String.format("%.2f", (double)arAgeTotal[i] / arrIncome.length));
		}
		
		avg = Double.parseDouble(
				String.format("%.2f", (double)total / length));
		
		System.out.println("=====================================");
		for (int i = 0; i < arBranchTotal.length; i++) {
			System.out.println(arBranch[i] + " �� ����� : " + arBranchTotal[i] + "����");
			System.out.println(arBranch[i] + " ��� ����� : " + arBranchAvg[i] + "����");
		}
		System.out.println("=====================================");
		for (int i = 0; i < arAgeTotal.length; i++) {
			System.out.println(arAge[i] + "���� �� ����� : " + arAgeTotal[i] + "����");
			System.out.println(arAge[i] + "���� ��� ����� : " + arAgeAvg[i] + "����");
		}
		System.out.println("=====================================");
		System.out.println("�ڽ� �� ����� : " + total + "����");
		System.out.println("�ڽ� ��� ����� : " + avg + "����");
		System.out.println("=====================================");
		
		bonusMsg = "�� �μ�Ƽ�� ���� ��\n";
		
		for (int i = 0; i < arrIncome.length; i++) {
			for (int j = 0; j < arrIncome[i].length; j++) {
				if(arrIncome[i][j] > avg) {
					bonusMsg += arBranch[i] + " " + arAge[j] + "����\n";
					bonusCheck = true;
				}
			}
		}
		
		if(!bonusCheck) {
			bonusMsg = "�μ�Ƽ�� ������ �����ϴ�. �й��ϼ���.\n";
		}
		System.out.print(bonusMsg);
	}
}
