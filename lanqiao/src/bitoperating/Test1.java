package bitoperating;
/**
 * 	λ�������Ӧ��
 * @author Administrator
 *
 */
public class Test1 {

	public static void main(String[] args) {
		//1.�ж���ż��
		int a=9;
		System.out.println((a&1)==1?"����":"ż��");
		
		//2.��ȡ�����Ƶ�iλ��ֵ
		System.out.println("��ȡ��4λ��"+((a>>3)&1));//��һ,3Ϊλ������0��ʼ
		System.out.println("��ȡ��4λ��"+((a&(1<<3))>>3));//����
		
		//3.��������ֵ����ʹ����ʱ����
		int a1,b1;
		a1=9;
		b1=6;
		a1=a1^b1;
		b1=a1^b1;
		a1=a1^b1;
		System.out.println(a1+" "+b1);
		
		//4.����if��������ֵ
		a=-9;
		System.out.println(a^(a>>31)+(a>>31));
	}

}
