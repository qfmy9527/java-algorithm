package algorithm;

import java.util.Scanner;

import org.junit.Test;
/**
 * 
 * @author Administrator
 *  �׳˵�Ӧ��
 */
public class Test001 {

	
	@Test
	// ���5�Ľ׳�
	public void ab() {
		int sum = 1;
		for (int j = 1; j <= 5; j++) {
			sum *= j;
		}
		System.out.println("5�Ľ׳���" + sum);
	}

	@Test
	// ���1��5�Ľ׳�
	public void ad() {
		for (int i = 1; i <= 5; i++) {
			int sum = 1;

			for (int j = 1; j <= i; j++) {
				sum *= j;
			}
			System.out.println(i + "�Ľ׳���:" + sum);
		}
	}
	
	
	public int dd(){
		System.out.println("�������������֣�");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
		return i;
	}
    //����������Ľ׳�
	@Test
	public void ac() {
		int dd = dd();
        long sum=1;
        for (int j = 1; j <=dd; j++) {
			sum *=j;
		}
        System.out.println(dd+"�Ľ׳��ǣ�"+sum);
        
	}

	//���������ǰ�ߵ�ÿһ�����ֵĽ׳�
	@Test
	public void ae() {
		int dd = dd();
		for (int i = 1; i <=dd; i++) {
			long sum = 1;

			for (int j = 1; j <= i; j++) {
				sum *= j;
			}
			System.out.println(i + "�Ľ׳���:" + sum);
		}
	}
	
}
