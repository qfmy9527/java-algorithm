package algorithm;

import java.util.Scanner;


/**
 * 
 * @author Administrator
 *  ˮ�ɻ�����
 *  ˮ�ɻ�����ָһ�� n λ����n��3 ����
 *  ����ÿ��λ�ϵ����ֵ� n ����֮�͵���������
 * �����磺1^3 + 5^3+ 3^3 = 153���� 
 */
public class Test002 {
  
	
	//ˮ�ɻ����ֵ���֤
	public static void main(String[] args) {
		System.out.println("��������λˮ�ɻ����֣�");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		//��ȡ��λ����
		int a=i/100;
		System.out.println("��λ"+a);
		//��ȡʮλ����
		int b=i/10%10;
		System.out.println("ʮλ"+b);
		//��ȡ��λ����
		int c=i%10;
		System.out.println("��λ"+c);
		int sum;
		sum=a*a*a+b*b*b+c*c*c;
		System.out.println("���ۼ���"+sum);
		if (i==sum) {
			System.out.println(i+"��ˮ�ɻ���");
		}else{
			System.out.println(i+"����ˮ�ɻ���");		
		}	
	}
}
