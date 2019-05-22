package string;
/**
 * String是不变对象,JVM对String有一个优化:
 * 常量池 当使用字面量形式创建字符串对象时,JVM会将其缓存在常量池中,
 * 当再次使用该字面量创建字符串对象时就重用对象,
 * 避免内存中堆积大量内容一样的字符串对象,减少内存开销。
 * @author Think
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1="1a";
		String s2="1a";
		String s3="1a";
		String s4="1"+"a";
		
		String s5="1";
		String s6=s5+"a";
		
		String s7=new String("1a");
 
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//true
		System.out.println(s1==s4);//true
		
		System.out.println(s1==s6);//false
		System.out.println(s1==s7);//false
 
		s1=s1+".";//创建一个新的对象
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2==s1);//false
		
		
		System.out.println(s1.length());
		
		System.out.println(s1.indexOf("a"));
		System.out.println(s1.indexOf("a",2));
		
		System.out.println(s1.lastIndexOf("a"));
	}
}
