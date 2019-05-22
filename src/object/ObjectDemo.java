package object;
/**
 * object 类的三个常用方法 toString、hashCode、equals
 * @author Think
  *java.lang包在使用的时候无需显示导入，编译的时候由编译器自动导入
  *
  *Object类是所有类的超类，是java中唯一没有父类的类，如果没有明确地指出超类，Object就被认为是这个类的超类 
  *在Java中，只有基本类型不是对象 

 */
public class ObjectDemo {

	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
		
		
	}

	/**
	 * 构造方法
	 * 
	 * @param x
	 * @param y
	 */
	public ObjectDemo(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	/**
	 * 重写toSting 方法
	 * 
	 * 重写toString方法:该方法是一个非常常用的方法, 很多API操作都会间接调用该方法。
	 * 方法的目的是将当前对象转换为字符串 ,
	 * 具体返回的字符串格式没有固定要求,遵循的原则是返回的内容中包含当前对象的属性信息, 
	 * 可以通过该字符串的内容直观反映出当前对象的内容。
	 */
	/**
	 * Object的toString方法的设计意图是将当前类的实例转换成一个字符
	 * Object已经实现了toString方法,默认返回当前对象的句柄(类名@地址),但一般没用,所以重写
	 */
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	
	public static void main(String[] args) {
		ObjectDemo a=new ObjectDemo(5,10);
		System.out.println(a.toString());
		System.out.println(a.hashCode());
		System.out.println(a.equals(a));
		
		
		
	}
}
