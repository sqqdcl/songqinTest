package test;

public class Gril extends Person {

	
	
	Gril(){
		//super("aa",8);
		System.out.println("子类的构造函数1");
	}

	Gril(String a){
		//super("aa",8);
		//this();
		super("a");
		
		
		System.out.println("子类的构造函数2");
	}
	
	
	 



	public static void main(String[] args) {
		Gril gril =new Gril("a");
	}
}
