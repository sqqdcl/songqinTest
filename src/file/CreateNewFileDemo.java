package file;
 
import java.io.File;
import java.io.IOException;
/**
 * 使用File创建一个新文件
 * @author Think
 * a
 */
public class CreateNewFileDemo {
	public static void main(String[] args) throws IOException {
		/**
		 * 在当前目录下新建一个文件test.txt
		 */
		File file=new File("./test.txt");//抽象路径
		//判断file文件表示的文件或目录是否真实存在
		if (!file.exists()) {
			//将file表示的文件创建出来
			file.createNewFile();//抛出异常
			System.out.println("successfully created");
		}else {
			System.out.println("already exist");
		}
	}
 
}
