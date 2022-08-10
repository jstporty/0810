/*
 * 1.생성법: 바깥클래스의 주소 .new 안쪽클래스 생성자()
 * 2.제한사항 : Member inner class는 static 변수와 static method를 가질수 없다.
 */

public class OuterClass1 extends DeprecationDemo {
	private String name = "한지민"; // Outer Class memever variavle
	private static int age = 26; // Outer Class static variable
	public void display() { /// Outer Class memeber method
		System.out.println("name=" + this.name);
	}

	public static void print() { // Outer Class static method
		System.out.println("Age=" + age);
	}

	public class InnerClass1 extends Main {// Member class
		public double avg = 89.5; // Inner class member variable
		//public static boolean flag = true; // Inner class static variable

		public void show() { // Inner class member method
			
			 //display();
			//print();
			// System.out.println("나이는="+age);
			// System.out.println("이름="+name);

		}

//		public static void 출력하다() { // Inner class static method
//			System.out.println("나이는=" + age);
//			System.out.println("이름=" + name);

//		}
	}
}