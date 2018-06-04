package algorithm;

import org.junit.Test;

/**
 * 
 * @author Administrator 冒泡排序
 */
public class Test004 {

	
	@Test
	public void abc() {
	    /*
	     * 随机从 1~100取二十个整数，存入数组
	     */
	        int [] arr =  new int[20];  //构建一个空的一维数组
	        for(int i=0;i<arr.length;i++){
	            int temp =  (int)(Math.random()*100)+1;//随机产生一个 1~100 的整数
	            arr[i] = temp;//将产生的数添加到数组
	            System.out.print(arr[i]+" ");
	       
	    }
		System.out.println();
		int[] a=arr;
		int n=arr.length;
		int i, j;

		for (i = 0; i < n; i++) {// 表示n次排序过程。
			for (j = 1; j < n-i; j++) {
				if (a[j] < a[j-1]) {// 前面的数字大于后面的数字就交换
					// 交换a[j+1]和a[j]
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

