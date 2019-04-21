package bitoperating;
/**
 * 	一题三解，二进制中1的个数
 * @author Administrator
 *
 */
public class Test3 {

		public static void main(String[] args) {
			
			int a=9;//二进制：1001
			int sum1,sum2,sum3;
			sum1=sum2=sum3=0;
			
			//目标数右移位
			for (int i = 0; i < 32; i++) {
				if(((a>>i)&1)==1) {
					sum1++;
				}
			}
			//参照数1左移位，再右移回原位
			for (int i = 0; i < 32; i++) {
				if((a&(1<<i))>>i==1) {
					sum2++;
				}
			}
			//利用二进制减法和与的性质每次消除一个1
			while(a!=0) {
				a=a&(a-1);
				sum3++;
			}
			
			System.out.println(sum1+" "+sum2+" "+sum3);
			
			//拓展：一条语句判断一个数是否为2的整数次方
			a=4;
			System.out.println((a&(a-1))==0?"Y":"N");
	}
	

}
