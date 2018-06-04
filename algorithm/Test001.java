package algorithm;

import java.util.Scanner;

import org.junit.Test;
/**
 * 
 * @author Administrator
 *  阶乘的应用
 */
public class Test001 {

	
	@Test
	// 输出5的阶乘
	public void ab() {
		int sum = 1;
		for (int j = 1; j <= 5; j++) {
			sum *= j;
		}
		System.out.println("5的阶乘是" + sum);
	}

	@Test
	// 输出1到5的阶乘
	public void ad() {
		for (int i = 1; i <= 5; i++) {
			int sum = 1;

			for (int j = 1; j <= i; j++) {
				sum *= j;
			}
			System.out.println(i + "的阶乘是:" + sum);
		}
	}
	
	
	public int dd(){
		System.out.println("请输入任意数字：");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
		return i;
	}
    //输出任意数的阶乘
	@Test
	public void ac() {
		int dd = dd();
        long sum=1;
        for (int j = 1; j <=dd; j++) {
			sum *=j;
		}
        System.out.println(dd+"的阶乘是："+sum);
        
	}

	//输出任意数前边的每一个数字的阶乘
	@Test
	public void ae() {
		int dd = dd();
		for (int i = 1; i <=dd; i++) {
			long sum = 1;

			for (int j = 1; j <= i; j++) {
				sum *= j;
			}
			System.out.println(i + "的阶乘是:" + sum);
		}
	}
	
}
