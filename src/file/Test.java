package file;

import java.io.File;

/**
 * 完成方法，删除指定的File表示的文件或目录。
 * @author Think
 *
 */
public class Test {
	
	
	public static void main(String[] args) {
		File dir=new File("a");
		delete(dir);
		System.out.println("hello");
	}
	
	public static void delete(File file) {
		/** 
		 * 首先判断file是否是一个目录,
		 * 要是目录则需要先将该目录的子项全部删除后才可以删除
		 * 目录,若是文件则可以直接删除
		 * */
		if (file.isDirectory()) {
			File[]files1=file.listFiles();
			for (int i = 0; i < files1.length; i++) {
				/**递归调用*/
				delete(files1[i]);
			}
			file.delete();
		}	  
		
	}
}
