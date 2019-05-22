package file;

import java.io.File;
/**
 * 删除目录
 * @author Think
 *
 */
public class DeleteDirDemo {
	public static void main(String[] args) {
		File dir=new File("demo");
		if (dir.exists()) {
			//删目录的前提是必须是一个空目录
			dir.delete();
			System.out.println("已删除");
		}else {
			System.out.println("没有该目录");
		}
	}
	
}
