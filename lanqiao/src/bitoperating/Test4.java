package bitoperating;
/**
 * 	二进制奇偶位互换
 * 	二进制表示小数
 * @author Administrator
 *
 */
public class Test4 {

	public static void main(String[] args) {
		int a=9;
		System.out.println(f1(a));
		System.out.println(f2(0.625));

	}
	
	/**
	 * 奇偶位互换
	 * @param i
	 * @return
	 */
	public static int f1(int i) {
		int ou=i&0xaaaaaaaa;//1010 1010...
		int ji=i&0x55555555;//0101 0101...
		return (ji<<1)^(ou>>1);
	}
	
	/**
	 * 用二进制表示小数
	 * @param i
	 * @return
	 */
	public static String f2(double i) {
		StringBuilder sb=new StringBuilder("0.");
		double r=0;
		while (i>0) {
			r=i*2;
			if(r>=1) {
				sb.append("1");
				i=r-1;
			}else {
				sb.append("0");
				i=r;
			}
			if(sb.length()>34) {
				return "Error";
			}
		}
		return sb+"";
	}

}
