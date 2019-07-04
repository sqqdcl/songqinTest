package file;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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
		List<String> a=new ArrayList();
		Map<String,String> b=new HashMap<String,String>();
		a.add(a1);
		a.add(a1);
		
		b.put("aa", "aaaa");
		b.put("aa", "bbb");
		
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
			System.out.println("使用for循环"+set1.toString());
		}
		
		Iterator<String> ita=a.listIterator();
		while(ita.hasNext()) {
			System.out.println("使用迭代器="+ita.next());
		}
		
		for (Map.Entry<String, String> map : b.entrySet()) {
			System.out.println(map.getKey()+map.getValue());
		}
		
		
	}

}
