package bitoperating;
/**
 * 	һ�����⣬��������1�ĸ���
 * @author Administrator
 *
 */
public class Test3 {

		public static void main(String[] args) {
			
			int a=9;//�����ƣ�1001
			int sum1,sum2,sum3;
			sum1=sum2=sum3=0;
			
			//Ŀ��������λ
			for (int i = 0; i < 32; i++) {
				if(((a>>i)&1)==1) {
					sum1++;
				}
			}
			//������1����λ�������ƻ�ԭλ
			for (int i = 0; i < 32; i++) {
				if((a&(1<<i))>>i==1) {
					sum2++;
				}
			}
			//���ö����Ƽ������������ÿ������һ��1
			while(a!=0) {
				a=a&(a-1);
				sum3++;
			}
			
			System.out.println(sum1+" "+sum2+" "+sum3);
			
			//��չ��һ������ж�һ�����Ƿ�Ϊ2�������η�
			a=4;
			System.out.println((a&(a-1))==0?"Y":"N");
	}
	

}
