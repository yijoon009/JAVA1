package daks;

import java.util.Scanner;

public class Practice {
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
		
		String[] arBranch= {"������","ȫ����","������"};
		String[] arAge= {"�Ϲ�","Ű��"};
		
		int[][] arrIncome=new int[arBranch.length][arAge.length];
		int length=0;
		
		int[] arBranchTotal=new int[3];
		int[] arAgeAvg=new int[2];
		
		int total=0;
		double avg=0.0;
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arrIncome.length;i++) {
			length +=arrIncome[i].length;			//�� ���� ���� �ǹ����� �𸣰ھ��...
			for(int j=0;j<arrIncome[i].length;j++) {
				System.out.println(arBranch[i]+" "+arAge[j]+"���� ������� �Է��Ͻÿ�. (����: ����) ");
				
				
				
			}
		}
		
	}
}
