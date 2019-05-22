package singleTon;

public class test {
	 /*如何选用：
	  * -单例对象 占用资源少，不需要延时加载，枚举 好于 饿汉
	  * -单例对象 占用资源多，需要延时加载，静态内部类 好于 懒汉式
	  */
	public static void main(String[] args) {
		SingletonDemo1 e1=SingletonDemo1.getInstance();
		SingletonDemo1 e2=SingletonDemo1.getInstance();
		System.out.println(e1.equals(e2));
		
		SingletonDemo2 l1=SingletonDemo2.getInstance();
		SingletonDemo2 l2=SingletonDemo2.getInstance();
		System.out.println(l1.equals(l2));
		
		SingletonDemo3 j1=SingletonDemo3.getInstance();
		SingletonDemo3 j2=SingletonDemo3.getInstance();
		System.out.println(j1.equals(j2));
		
	}
}
