package algorithm;

import java.util.Scanner;


/**
 * 
 * @author Administrator
 *  水仙花数字
 *  水仙花数是指一个 n 位数（n≥3 ），
 *  它的每个位上的数字的 n 次幂之和等于它本身
 * （例如：1^3 + 5^3+ 3^3 = 153）。 
 */
public class Test002 {
  
	
	//水仙花数字的验证
	public static void main(String[] args) {
		System.out.println("请输入三位水仙花数字：");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		//获取百位数字
		int a=i/100;
		System.out.println("百位"+a);
		//获取十位数字
		int b=i/10%10;
		System.out.println("十位"+b);
		//获取个位数字
		int c=i%10;
		System.out.println("各位"+c);
		int sum;
		sum=a*a*a+b*b*b+c*c*c;
		System.out.println("理论计算"+sum);
		if (i==sum) {
			System.out.println(i+"是水仙花数");
		}else{
			System.out.println(i+"不是水仙花数");		
		}	
	}
}
