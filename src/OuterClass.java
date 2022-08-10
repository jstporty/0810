/*
 * Nested(static)Inner Class
 * 1.생성법:OuterClass.InnerClass참조변수 = new OuterClass.InnerClass()
 * 2.제한사항: Static Inner Class는 OuterClass의 멤버변수/ 멤버메소드 접근 불가
 */
public class OuterClass {
	private String name = "한지민"; // Outer Class memever variavle
	private static int age = 26; // Outer Class static variable

	public void display() { /// Outer Class memeber method
		System.out.println("name=" + this.name);
	}

	public static void print() { // Outer Class static method
		System.out.println("Age=" + age);
	}

	public static class InnerClass {
		public double avg = 89.5; // Inner class member variable
		public static boolean flag = true; // Inner class static variable

		public void show() { // Inner class member method
			// display();
			print();
			// System.out.println("나이는="+age);
			// System.out.println("이름="+name);

		}

		public static void 출력하다() { // Inner class static method
			System.out.println("나이는=" + age);
			//System.out.println("이름=" + name);

		}
	}
}
