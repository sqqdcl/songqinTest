package file;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file=new File("./demo.txt");
		System.out.println(file.getName());
		System.out.println(file.length());
		/**可读*/
		System.out.println(file.canRead());
		/**可写*/
		System.out.println(file.canWrite());
		/**是否隐藏*/
		System.out.println(file.isHidden());
		
		
		String a1="bb";
		List a=new ArrayList();
		Map b=new HashMap();
		a.add(a1);
		a.add(a1);
		
		Set<String> c=new HashSet<String>();
		c.add(a1);
		c.add(a1);
		c.add("22");
		c.add("22");
		c.add("22");
		c.add("22");
		c.add("22");
		c.add("22");
		c.add("22");
		c.add("223");
		
		System.out.println("==="+a.size());
		for (Object set1 : a) {
			System.out.println(set1.toString());
		}
		
		
		
		
		
		
	}

}
