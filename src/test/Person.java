package test;

public  class Person {
	int age;
	String name;
//	
//	Person(String name,int age){
//		System.out.println("父类的构造函数调用了");
//		this.age=age;
//		this.name=name;
////	}
	Person(){
		System.out.println("父类无参构造函数");
	}
	Person(String s){
		System.out.println("有参构造函数");
	}
	public static void main(String[] args) {
		int i = 0;
	}
}
