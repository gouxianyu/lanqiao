package bitoperating;
/**
 * 	位运算题解
 * 	求重与求单
 * @author Administrator
 *
 */
public class Test2 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,5};
		getRepeat(a);
		int[] b={1,1,2,2,3,3,4,5,5,6,6,7,7};
		getNoRepeat(b);
	}
	
	/**
	 * 	获取a中唯一重复的数
	 * @param a
	 */
	public static void getRepeat(int[] a) {
		int x=0;
		for (int i = 1; i < a.length; i++) {
			x=x^i^a[i-1];
		}
		x=x^a[a.length-1];
		System.out.println(x);
	}
	
	/**
	 * 	获取a中落单的数
	 * @param a
	 */
	public static void getNoRepeat(int[] a) {
		int x=0;
		for (int i = 0; i < a.length; i++) {
			x=x^a[i];
		}
		System.out.println(x);
	}

}
