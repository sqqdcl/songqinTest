package file;

import java.io.File;
/**
 * 删除一个文件
 * @author Think
 *
 */
public class DeleteFileDemo {
	public static void main(String[] args) {
		/**
		 * 删除当前目录下的test.txt ./是默认的
		 */
		File file = new File("test.txt");
		file.delete();
		if (!file.exists()) {
			System.out.println("successfully deleted");
		}
	}
}
