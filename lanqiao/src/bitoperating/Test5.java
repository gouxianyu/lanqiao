package bitoperating;

/**
 * 	出现K此与出现一次
 * @author Administrator
 *
 */
public class Test5 {

	public static void main(String[] args) {
	int[] a= {1,1,1,2,2,2,6,3,3,3,4,4,4};
	System.out.println(f1(a, 3));
	}
	/**
	 * a中只有一个数出现一次，其他数均出现K次，求出现一次的数;
	 * 	原理：k个k进制数做不进位加法后结果为0
	 * @param a
	 * @param k
	 * @return
	 */
	public static int f1(int[] a,int k) {
		//转换为K进制字符数组
		int len=a.length;
		char[][] kRadix=new char[len][];
		int maxlength=0;
		for (int i = 0; i < kRadix.length; i++) {
			kRadix[i]=new StringBuilder(Integer.toString(a[i], k)).reverse().toString().toCharArray();
			if(kRadix[i].length>maxlength) {
				maxlength=kRadix[i].length;
			}
		}
		//不进位加法运算
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
		//还原
		int result=0;
		for (int i = 0; i < resArr.length; i++) {
			result+=(resArr[i]%k)*Math.pow(k, i);
		}
		return result;
	}

}
