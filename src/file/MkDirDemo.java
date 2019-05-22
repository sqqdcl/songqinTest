package file;

import java.io.File;
/**
 * 创建一个目录
 * @author Think
 *
 */
public class MkDirDemo {
	public static void main(String[] args) {
		/**
		 * 在当前目录下新建一个目录:demo
		 */
		File dir = new File("demo");
		if (!dir.exists()) {
			dir.mkdir();
			System.out.println("已创建");
		} else {
			System.out.println("已存在");
		}
	}
}
