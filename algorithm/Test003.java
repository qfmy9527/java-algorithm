package algorithm;

import org.junit.Test;

/**
 * 
 * @author Administrator ð������
 */
public class Test003 {

	
	@Test
	public void abc() {
		int[] arr = { 1, 1, 2, 0, 9, 3, 12, 7, 8, 3, 4, 65, 22 };
		for (int i : arr) {
			System.out.print(i+",");
		}
		System.out.println();
		int[] a=arr;
		int n=arr.length;
		int i, j;

		for (i = 0; i < n; i++) {// ��ʾn��������̡�
			for (j = 1; j < n-i; j++) {
				if (a[j] < a[j-1]) {// ǰ������ִ��ں�������־ͽ���
					// ����a[j+1]��a[j]
					int t;
					t= a[j];
					a[j] = a[j-1];
					a[j-1] = t;
				}
			}
		
		}
		for (int i1 : arr) {
			System.out.print(i1 + ",");
		}

	}
}

