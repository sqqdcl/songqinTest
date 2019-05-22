package string;
/**
 * 线程安全的
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		String str = "好好学习java";
		System.out.println(str);
		// 创建时给定字符串内容
		StringBuffer stringBuffer = new StringBuffer(str);
		/** append:将指定内容追加到当前字符串末尾 */
		stringBuffer.append(",为了找个好工作!");
		stringBuffer.toString();
		System.out.println(stringBuffer);
		/** replace:将指定范围内的字符串替换为给定内容 */
		stringBuffer.replace(9, 16, "就是为了改变世界");
		stringBuffer.toString();
		System.out.println(stringBuffer);
		/** delete:删除指定范围内的字符串 */
		stringBuffer.delete(0, 8);
		stringBuffer.toString();
		System.out.println(stringBuffer);
		/** insert:将指定内容插入到指定位置 */
		stringBuffer.insert(0, "活着");
		stringBuffer.toString();
		System.out.println(stringBuffer);
	}
}
