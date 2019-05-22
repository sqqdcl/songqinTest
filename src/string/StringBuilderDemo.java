package string;
/**
 * 线程不安全的
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		String str = "好好学习java";
		System.out.println(str);
		// 创建时给定字符串内容
		StringBuilder stringBuilder = new StringBuilder(str);
		/** append:将指定内容追加到当前字符串末尾 */
		stringBuilder.append(",为了找个好工作!");
		stringBuilder.toString();
		System.out.println(stringBuilder);
		/** replace:将指定范围内的字符串替换为给定内容 */
		stringBuilder.replace(9, 16, "就是为了改变世界");
		stringBuilder.toString();
		System.out.println(stringBuilder);
		/** delete:删除指定范围内的字符串 */
		stringBuilder.delete(0, 8);
		stringBuilder.toString();
		System.out.println(stringBuilder);
		/** insert:将指定内容插入到指定位置 */
		stringBuilder.insert(0, "活着");
		stringBuilder.toString();
		System.out.println(stringBuilder);
	}
}
