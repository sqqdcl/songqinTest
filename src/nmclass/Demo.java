package nmclass;

/*
 * 1、与子类有关的匿名类
 * 2、与接口有关的匿名类(只要把接口换成子类即可,不演示)
 */
public class Demo{

	public static void main(String args[]) {

		Test test = new Test();

		Person person = new Boy();

		test.test(person);

		person = new Gril();

		test.test(person);

		test.test(new Boy());

		/**
		 * 
		 * 这里是与子类有关的匿名类的关键知识点
		 * 
		 * 这个匿名类相当与Boy，Gril类，这个是我不需要事先定义这个类，而是我什么时候要用，什么时候写一个匿名类，这种写法代表着其子类
		 * 
		 */

		test.test(new Person() {
			@Override
			void speak() {
				System.out.println("与子类有关的匿名类！");
			}
		});

	}

}