package algorithm;

import org.junit.Test;

/**
 * 
 * @author Administrator ð������
 */
public class Test004 {

	
	@Test
	public void abc() {
	    /*
	     * ����� 1~100ȡ��ʮ����������������
	     */
	        int [] arr =  new int[20];  //����һ���յ�һά����
	        for(int i=0;i<arr.length;i++){
	            int temp =  (int)(Math.random()*100)+1;//�������һ�� 1~100 ������
	            arr[i] = temp;//������������ӵ�����
	            System.out.print(arr[i]+" ");
	       
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

