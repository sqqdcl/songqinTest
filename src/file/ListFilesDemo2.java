package file;

import java.io.File;
import java.io.FileFilter;


/**
 * listFiles有一个重载方法，允许我们传入一个参数，
 * 该参数为一个文件过滤器，
 * 那么该方法会将目录中满足过滤器要求的子项返回。
 * 
 * @author Think
 *
 */
public class ListFilesDemo2 {
	public static void main(String[] args) {
		File dir = new File(".");
		/**
		 * 获取当前目录中名字以"."开头的子项
		 */
		File[] dirs = dir.listFiles(new FileFilter() {
			public boolean accept(File pathname) {
				String name = pathname.getName();
				return name.startsWith(".");
			}
		});
		
		/**
		 * 该listFiles方法会将目录中的每个子项都通过 调用给定的过滤器的accept方法进行判断，将返 回true的子项保留并以数组形式返回
		 */
		System.out.println(dirs.length);
	}
}
