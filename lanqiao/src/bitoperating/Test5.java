package bitoperating;

/**
 * 	����K�������һ��
 * @author Administrator
 *
 */
public class Test5 {

	public static void main(String[] args) {
	int[] a= {1,1,1,2,2,2,6,3,3,3,4,4,4};
	System.out.println(f1(a, 3));
	}
	/**
	 * a��ֻ��һ��������һ�Σ�������������K�Σ������һ�ε���;
	 * 	ԭ��k��k������������λ�ӷ�����Ϊ0
	 * @param a
	 * @param k
	 * @return
	 */
	public static int f1(int[] a,int k) {
		//ת��ΪK�����ַ�����
		int len=a.length;
		char[][] kRadix=new char[len][];
		int maxlength=0;
		for (int i = 0; i < kRadix.length; i++) {
			kRadix[i]=new StringBuilder(Integer.toString(a[i], k)).reverse().toString().toCharArray();
			if(kRadix[i].length>maxlength) {
				maxlength=kRadix[i].length;
			}
		}
		//����λ�ӷ�����
		int[] resArr=new int[maxlength];
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < maxlength; j++) {
				if(j>=kRadix[i].length) {
					resArr[j]+=0;
				}else {
					resArr[j]+=kRadix[i][j]-'0';
				}
			}
		}
		//��ԭ
		int result=0;
		for (int i = 0; i < resArr.length; i++) {
			result+=(resArr[i]%k)*Math.pow(k, i);
		}
		return result;
	}

}
