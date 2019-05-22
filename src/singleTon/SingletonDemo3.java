package singleTon;
/**
 * 静态内部类实现模式（线程安全，调用效率高，可以延时加载）
 * 

 * 
 * @author Think
 *
 */
public class SingletonDemo3 {
	/**
	  * 使用内部类的好处是，静态内部类不会在单例加载时就加载，
	  * 而是在调用getInstance()方法时才进行加载，达到了类似懒汉模式的效果，
	  * 而这种方法又是线程安全的
	 */
	 private static class SingletonClassInstance{
	        private static final SingletonDemo3 instance=new SingletonDemo3();
	    }
	     
	 	private SingletonDemo3(){}
	     
	    public static SingletonDemo3 getInstance(){
	        return SingletonClassInstance.instance;
	    }
 }
