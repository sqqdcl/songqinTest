package file;

import java.io.File;
/**
 *        获取一个目录的所有子项。
 * @author Think
 *
 */
public class ListFilesDemo {
	public static void main(String[] args) {
		/**
		 * 获取当前目录的所有子项
		 */
		File dir=new File(".");
		/**
		 * boolean isDirectory()
		 * 判断file表示的是一个目录
		 * boolean isFile()
		 * 判断是否是一个文件
		 */
		if (dir.isDirectory()) {
			File[]files=dir.listFiles();
			System.out.println(files.length);
			for (int i = 0; i < files.length; i++) {
				System.out.println(files[i].getName());
			}
		}
	}
}
