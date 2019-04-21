package bitoperating;
/**
 * 	位运算基础应用
 * @author Administrator
 *
 */
public class Test1 {

	public static void main(String[] args) {
		//1.判断奇偶数
		int a=9;
		System.out.println((a&1)==1?"奇数":"偶数");
		
		//2.获取二进制第i位的值
		System.out.println("获取第4位："+((a>>3)&1));//法一,3为位数，从0开始
		System.out.println("获取第4位："+((a&(1<<3))>>3));//法二
		
		//3.交换变量值，不使用临时变量
		int a1,b1;
		a1=9;
		b1=6;
		a1=a1^b1;
		b1=a1^b1;
		a1=a1^b1;
		System.out.println(a1+" "+b1);
		
		//4.不用if语句求绝对值
		a=-9;
		System.out.println(a^(a>>31)+(a>>31));
	}

}
